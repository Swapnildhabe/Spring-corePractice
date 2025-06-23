package org.example;

public class Car {

    private String brand;
    private String model;

//    Constructor injection using   <constructor-arg value="Snova"/> in xml
    public Car(String model  ){
        this.model = model;
        System.out.println("Car constructor is called");

    }

    public void dirve(){
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

//    public void setModel(String model) {
//        this.model = model;
//    }
}
