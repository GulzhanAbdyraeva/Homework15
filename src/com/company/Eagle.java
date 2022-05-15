package com.company;

public class Eagle extends Animal {

    private String name;

    public Eagle() {
    }

    public Eagle(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println("Eagle can fly: ");
    }

    @Override
    public void say() {
        System.out.println("Eagle say sshuuuu-sshuuuu");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }
}
