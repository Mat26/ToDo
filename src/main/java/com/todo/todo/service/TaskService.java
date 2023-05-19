package com.todo.todo.service;

import com.todo.todo.entity.Task;
import com.todo.todo.entity.dto.TaskDto;
import com.todo.todo.repository.TaskResposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements TaskServiceImpl{

  private TaskResposity taskResposity;

  @Autowired
  public TaskService(TaskResposity taskResposity){
    this.taskResposity = taskResposity;
  }

  public TaskDto createNewTask(TaskDto task){
    Task newTask = Task.builder()
        .titulo(task.titulo())
        .description(task.description())
        .fechaCreacion(task.fechaCreacion())
        .fechaTerminacion(task.fechaTerminacion())
        .finalizada(task.finalizada())
        .estado(task.estado())
        .build();
    newTask = taskResposity.save(newTask);
    TaskDto taskResponse =
        new TaskDto(newTask.getTitulo(),newTask.getDescription(), newTask.getFechaCreacion(),newTask.getFechaTerminacion(),newTask.isFinalizada(),newTask.getEstado());

    return taskResponse;
  }

}
