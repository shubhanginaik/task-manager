package com.example.task_manager.service;

import com.example.task_manager.model.Task;
import com.example.task_manager.repository.TaskRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
  private final TaskRepository taskRepository;

  public TaskService(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  public Task addTask(Task task){
    return  taskRepository.save(task);
  }

  public List<Task> getAllTasks(){
    return taskRepository.findAll();
  }

  public void deleteTask(Long id){
    Optional<Task> task = taskRepository.findById(id);
    if (task.isPresent()) {
      taskRepository.delete(task.get());
    } else {
      throw new RuntimeException("Task not found");
    }
    taskRepository.delete(taskRepository.findById(id).orElseThrow());
  }

}
