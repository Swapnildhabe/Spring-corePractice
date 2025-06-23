package org.example;

public class VolvoEngine implements Engine{
    public void VolvoEngine(){
        System.out.println("Volvo Engine constructor is called");
    }

    @Override
    public void startEngine() {
        System.out.println("Volvo Engine is started..");

    }

    @Override
    public void stopEngine() {
        System.out.println("Volvo Engine is stopped...");
    }
}
