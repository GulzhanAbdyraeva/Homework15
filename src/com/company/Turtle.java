package com.company;

public class Turtle extends Animal{

    private String name;

    public Turtle() {
    }

    public Turtle(String name) {
        this.name = name;
    }

    public void swim(){
        System.out.println("Turtle can swimming: ");
    }

    @Override
    public void say() {
        System.out.println("Turtle say hop-hop");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                '}';
    }
}
