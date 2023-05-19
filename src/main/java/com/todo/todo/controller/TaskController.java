package com.todo.todo.controller;

import com.todo.todo.entity.dto.TaskDto;
import com.todo.todo.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ToDo")
public class TaskController {

  private TaskServiceImpl taskService;

  @Autowired
  public TaskController(TaskServiceImpl taskService) {
    this.taskService = taskService;
  }

  @PostMapping
  private TaskDto createTask(@RequestBody TaskDto task){
    return taskService.createNewTask(task);
  }

}
