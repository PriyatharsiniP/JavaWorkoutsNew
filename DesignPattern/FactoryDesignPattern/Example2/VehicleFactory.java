package org.example.designPatterns.creationalDesignPattern.factoryDesignPattern.example2;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicle){
        if(vehicle == null){
            return null;
        }else if(vehicle.equalsIgnoreCase("car")){
            return new Car();
        }else if(vehicle.equalsIgnoreCase("truck")){
            return new Truck();
        }else if(vehicle.equalsIgnoreCase("bike")){
            return new Bike();
        }else{
            return null;
        }
    }
}
