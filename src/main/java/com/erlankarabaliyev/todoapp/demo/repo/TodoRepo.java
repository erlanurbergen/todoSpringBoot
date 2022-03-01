package com.erlankarabaliyev.todoapp.demo.repo;

import com.erlankarabaliyev.todoapp.demo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo, Long> {

}
