package com.example.tovodoo.todo;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TodoList {

	@Id
	@GeneratedValue
	private Long id;

	private List<TodoItem> todoItems;

	public List<TodoItem> getTodoItems() {
		return todoItems;
	}

	public void setTodoItems(List<TodoItem> todoItems) {
		this.todoItems = todoItems;
	}
}
