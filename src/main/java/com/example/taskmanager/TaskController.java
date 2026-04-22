package com.example.taskmanager;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class TaskController {

    private List<Task> tasks = new ArrayList<>();
    private Long idCounter = 1L;

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
        task.setId(idCounter++);
        tasks.add(task);
        return task;
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}