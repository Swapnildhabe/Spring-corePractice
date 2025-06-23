package org.example;

public class Car {

    private String brand;
    private String model;

    private Engine engine;

//    Constructor injection using   <constructor-arg value="Snova"/> in xml
//    public Car(String model, String brand, Engine engine  ){
//        this.model = model;
//        this.engine = engine;
//        this.brand = brand;
//        System.out.println("Car constructor is called");
//
//    }

    public Car() {

    }

    public Engine getEngine() {
        System.out.println("get engine is called...");
        return engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("get Engine is called...");
        this.engine = engine;
    }

    public void drive(){
        System.out.println("Car is driven");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Set Brand is Called");
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
