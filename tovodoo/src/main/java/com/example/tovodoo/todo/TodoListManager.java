package com.example.tovodoo.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoListManager {

    private static TodoListManager instance;
    private List<TodoItemDto> todos;

    private TodoListManager() {
        todos = new ArrayList<>();
        this.addTodo(new TodoItemDto("Sample Todo 1"));
        this.addTodo(new TodoItemDto("Sample Todo 2"));
    }

    public static synchronized TodoListManager getInstance() {
        if (instance == null) {
            instance = new TodoListManager();
        }
        return instance;
    }

    public List<TodoItemDto> getTodos() {
        return todos;
    }

    public void addTodo(TodoItemDto todo) {
        todos.add(todo);
    }

    public TodoItemDto getTodoById(Long id) {
        return todos.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void removeTodoById(Long id) {
        todos.removeIf(t -> t.getId().equals(id));
    }

    public void updateTodoById(Long id, String message, boolean complete) {
        TodoItemDto todo = getTodoById(id);
        if (todo != null) {
            todo.setTask(message);
            todo.setCompleted(complete);
        }
    }
}
