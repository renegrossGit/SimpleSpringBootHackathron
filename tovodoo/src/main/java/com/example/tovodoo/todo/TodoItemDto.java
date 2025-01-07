package com.example.tovodoo.todo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TodoItemDto {
    private static long lastId = 0; // Static field to keep track of the last assigned id

    private Long id;
    private String task;
    private boolean completed;

    // Constructor
    public TodoItemDto(@JsonProperty("task") String message) {
        this.id = ++lastId; // Increment the lastId and assign it to the new instance
        this.task = message;
        this.completed = false; // Set complete to false by default
    }

    // Getter for id
    public Long getId() {
        return id;
    }

    // Getter for message
    public String getTask() {
        return task;
    }

    // Setter for message
    public void setTask(String message) {
        this.task = message;
    }

    // Getter for complete
    public boolean isCompleted() {
        return completed;
    }

    // Setter for complete
    public void setCompleted(boolean complete) {
        this.completed = complete;
    }
}
