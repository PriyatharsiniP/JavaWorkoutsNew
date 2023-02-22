package org.example.designPatterns.creationalDesignPattern.factoryDesignPattern.example2;

public class Client {
    public static void main(String[] args){
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("bike");
        vehicle.service();
    }
}
