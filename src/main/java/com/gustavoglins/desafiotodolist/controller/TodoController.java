package com.gustavoglins.desafiotodolist.controller;

import com.gustavoglins.desafiotodolist.entity.Todo;
import com.gustavoglins.desafiotodolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo){
        todoService.create(todo);
        return ResponseEntity.ok(todo);
    }

    @GetMapping
    public List<Todo> listTodos(){
        return todoService.listAll();
    }

    @PutMapping
    public ResponseEntity<Todo> updatedTodo(@RequestBody Todo todo){
        todoService.update(todo);
        return ResponseEntity.ok(todo);
    }

    @DeleteMapping("{id}")
    public void deleteTodo(@PathVariable("id") Long id){
        todoService.delete(id);
    }
}
