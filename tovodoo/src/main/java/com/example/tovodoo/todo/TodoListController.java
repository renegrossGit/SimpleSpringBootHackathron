package com.example.tovodoo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping
    public ResponseEntity<List<TodoItemDto>> getAllTodos() {
        return new ResponseEntity<>(todoListService.getAllTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoItemDto> getTodoById(@PathVariable Long id) {
        TodoItemDto todo = todoListService.getTodoById(id);
        if (todo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TodoItemDto> createTodo(@RequestBody TodoItemDto todo) {
        return new ResponseEntity<>(todoListService.addTodo(todo), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoItemDto> updateTodo(@PathVariable Long id, @RequestBody TodoItemDto updatedTodo) {
        TodoItemDto updated = todoListService.updateTodoById(id, updatedTodo);
        if (updated == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        if (!todoListService.removeTodoById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
