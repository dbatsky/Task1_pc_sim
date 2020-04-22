package com.homework;

// Concrete Decorator
public class PCGamingDecorator extends PCDecorator {
    public PCGamingDecorator(IPC computer) {
        this.pc = computer;
    }

    public void doWork(String output){
        output = "Gaming... " + output;
        this.pc.doWork(output);
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
