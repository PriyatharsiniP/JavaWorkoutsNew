package org.example.designPatterns.creationalDesignPattern.factoryDesignPattern.example1;

public class Circle implements Shape{
    Circle(){
        System.out.println("I am circle constructor");
    }
    @Override
    public void display() {
        System.out.println("I am circle");
    }
}
