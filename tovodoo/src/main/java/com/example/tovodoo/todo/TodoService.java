package com.example.tovodoo.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodoById(Long id, Todo updatedTodo) {
        if (todoRepository.existsById(id)) {
            updatedTodo.setId(id);
            return todoRepository.save(updatedTodo);
        }
        return null;
    }

    public boolean removeTodoById(Long id) {
        if (todoRepository.existsById(id)) {
            todoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void removeAllTodos() {
        todoRepository.deleteAll();
    }
}
