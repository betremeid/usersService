package com.Beatrice;

public class Persons {
    private int name;
    private String email;
    private int age;

    public Persons(int name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
