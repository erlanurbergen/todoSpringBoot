package com.erlankarabaliyev.todoapp.demo.controllers;


import com.erlankarabaliyev.todoapp.demo.entity.Todo;
import com.erlankarabaliyev.todoapp.demo.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class MainController {

    @Autowired
    private TodoRepo todoRepo;



    @GetMapping
    public List<Todo> getAllTodoItems() {
        return todoRepo.findAll();
    }

    @PostMapping
    public Todo saveTodoItem(@RequestBody Todo todo) {
        return todoRepo.save(todo);
    }

    @PutMapping
    public Todo updateTodo(@RequestBody Todo todo) {
        return todoRepo.save(todo);

    }

    @DeleteMapping(value = "/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoRepo.deleteById(id);
    }
}
