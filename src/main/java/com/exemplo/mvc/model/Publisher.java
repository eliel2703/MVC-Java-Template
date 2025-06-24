package com.exemplo.mvc.model;

public class Publisher {
    String name;
    private String location;

     
    public Publisher(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters e Setters
    public String getname() { return name; }
    public void setname(String name) { this.name = name; }
    public String getlocation() { return location; }
    public void setlocation(String location) { this.location = location; }
}
