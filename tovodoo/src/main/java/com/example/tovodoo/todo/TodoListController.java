package com.example.tovodoo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

	// This method handles GET requests to the "/todolist" endpoint
	@GetMapping("/todolist")
	public String translateTodoList(@RequestParam TodoList todoList) {
		return "Hello, World!";
	}

}
