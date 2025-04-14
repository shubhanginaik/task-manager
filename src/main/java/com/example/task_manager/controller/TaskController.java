package com.example.task_manager.controller;

import com.example.task_manager.model.Task;
import com.example.task_manager.service.TaskService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class TaskController {
  private final TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @GetMapping("/tasks")
  public List<Task> getAllTasks() {
    return new ArrayList<>(List.of());
  }

  @PostMapping("/add")
  public Task addTask(Task task) {
    return taskService.addTask(task);
  }
  @DeleteMapping("/id")
  public void deleteTask(Long id) {
    taskService.deleteTask(id);
  }

}
