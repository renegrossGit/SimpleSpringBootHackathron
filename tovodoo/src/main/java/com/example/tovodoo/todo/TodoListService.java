package com.example.tovodoo.todo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoListService {

    private TodoListManager todoListManager = TodoListManager.getInstance();

    public List<TodoItemDto> getAllTodos() {
        return todoListManager.getTodos();
    }

    public TodoItemDto getTodoById(Long id) {
        return todoListManager.getTodoById(id);
    }

    public TodoItemDto addTodo(TodoItemDto todo) {
        todoListManager.addTodo(todo);
        return todo;
    }

    public TodoItemDto updateTodoById(Long id, TodoItemDto updatedTodo) {
        TodoItemDto todo = todoListManager.getTodoById(id);
        if (todo == null) {
            return null;
        }
        todoListManager.updateTodoById(id, updatedTodo.getTask(), updatedTodo.isCompleted());
        return todoListManager.getTodoById(id);
    }

    public boolean removeTodoById(Long id) {
        TodoItemDto todo = todoListManager.getTodoById(id);
        if (todo == null) {
            return false;
        }
        todoListManager.removeTodoById(id);
        return true;
    }
}
