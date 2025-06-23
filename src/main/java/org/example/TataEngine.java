package org.example;

public class TataEngine implements Engine{
    public void TataEngine(){
        System.out.println("TataEngine constructor is called");
    }

    @Override
    public void startEngine() {
        System.out.println("Tata Engine is started..");

    }

    @Override
    public void stopEngine() {
        System.out.println("Tata Engine is stopped...");
    }
}
