package com.example.taskmanager;

public class Task {
    private Long id;
    private String name;

    public Task() {}

    public Task(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}

