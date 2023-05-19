package com.todo.todo.repository;

import com.todo.todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskResposity extends JpaRepository<Task,Long> {
}
