package com.todo.todo.entity.dto;

import com.todo.todo.entity.Status;

import java.util.Date;


public record TaskDto(String titulo,String description,String fechaCreacion,String fechaTerminacion,boolean finalizada,Status estado) {
}
