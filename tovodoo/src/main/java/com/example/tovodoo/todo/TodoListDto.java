package com.example.tovodoo.todo;

import java.util.List;

public class TodoListDto {
	private List<TodoItemDto> todoItems;

	public List<TodoItemDto> getTodoItems() {
		return todoItems;
	}

	public void setTodoItems(List<TodoItemDto> todoItems) {
		this.todoItems = todoItems;
	}
}
