package org.example.designPatterns.creationalDesignPattern.factoryDesignPattern.example1;

public class Client {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.display();
    }
}
