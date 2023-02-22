package org.example.designPatterns.creationalDesignPattern.factoryDesignPattern.example1;

public class Rectangle implements Shape{
    Rectangle(){
        System.out.println("I am rectangle constructor");
    }
    @Override
    public void display() {
        System.out.println("I am Rectangle");
    }
}
