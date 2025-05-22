package web.service;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class TaskServiceTest {

    private TaskService service;

    @Before
    public void setup() {
        service = new TaskService();
    }

    @Test
    public void testGetTasksForStudent() {
        service.submitTask("student1", "Task 1");
        List<String> tasks = service.getTasksForStudent("student1");
        assertEquals(1, tasks.size());
        assertEquals("Task 1", tasks.get(0));
    }
}
