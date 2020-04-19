package com.homework;

// Concrete Decorator
public class PCGamingDecorator extends PCDecorator {
    public PCGamingDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public void doWork(){
        if(getState() instanceof PCStateON) {
            pc.doWork();
            System.out.print("Gaming... ");
        }
        else
        {
            System.out.println("The PC isn't ON - Cannot Do Work!\n");
        }
    }
    public void turnOn() {
        System.out.print("Gaming ");
        pc.turnOn();
    }
    public void turnOff(){
        System.out.print("\n");
        System.out.print("Gaming ");
        pc.turnOff();
    }
}
