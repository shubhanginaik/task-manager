package com.example.task_manager.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.example.task_manager.model.Task;
import com.example.task_manager.repository.TaskRepository;
import java.util.List;
import org.junit.jupiter.api.Test;

 class TaskServiceTests {

  @Test
   void testGetAllTasks() {
    // Implement your test logic here
    TaskRepository mockRepo = mock(TaskRepository.class);
    TaskService taskService = new TaskService(mockRepo);

    Task task1 = new Task();
    task1.setTitle("Task 1");
    task1.setCompleted(false);
     Task task2 = new Task();
    task2.setTitle("Task 2");
    task2.setCompleted(true);

    when(mockRepo.findAll()).thenReturn(List.of(task1, task2));
    List<Task> tasks = taskService.getAllTasks();
    assertEquals(2, tasks.size());
  }

}
