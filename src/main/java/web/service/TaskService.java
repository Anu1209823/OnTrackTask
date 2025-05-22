package web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskService {

    private Map<String, List<String>> tasksByStudent = new HashMap<>();

    public void submitTask(String studentId, String task) {
        tasksByStudent.putIfAbsent(studentId, new ArrayList<>());
        tasksByStudent.get(studentId).add(task);
    }

    public List<String> getTasksForStudent(String studentId) {
        return tasksByStudent.getOrDefault(studentId, new ArrayList<>());
    }
}
