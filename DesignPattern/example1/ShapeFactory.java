package org.example.designPatterns.creationalDesignPattern.factoryDesignPattern.example1;

public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape == null){
            return null;
        }else if(shape.equalsIgnoreCase("circle") ){
            return new Circle();
        }else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
