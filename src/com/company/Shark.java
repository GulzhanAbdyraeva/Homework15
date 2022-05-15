package com.company;

public class Shark extends Animal {

    private String name;

    public Shark() {
    }

    public Shark(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("Shark is attacking: ");
    }

    @Override
    public void say() {
        System.out.println("Shark say shark-shark");
    }



    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                '}';
    }
}
