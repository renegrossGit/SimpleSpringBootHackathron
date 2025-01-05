package com.example.tovodoo.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tovodoo.vokabel.Vokabel;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

	List<TodoItem> findAllTodoItemsContainingVokabel(Vokabel vokabel);

}
