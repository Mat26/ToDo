package com.todo.todo.service;

import com.todo.todo.entity.dto.TaskDto;

public interface TaskServiceImpl {

  TaskDto createNewTask(TaskDto task);
}
