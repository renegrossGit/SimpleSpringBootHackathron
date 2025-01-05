package com.example.tovodoo.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {

	List<TodoList> findAllTodoListsContainingTodoItem(TodoItem todoItem);
}
