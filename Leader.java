package com.example.javafxdemo;

public class Leader {
    private String name;

    private Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
