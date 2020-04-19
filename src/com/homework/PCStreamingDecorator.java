package com.homework;

// Concrete Decorator
public class PCStreamingDecorator extends PCDecorator {
    public PCStreamingDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public void doWork(){
        if(getState() instanceof PCStateON) {
            pc.doWork();
            System.out.print("Streaming... ");
        }
        else
        {
            System.out.println("The PC isn't ON - Cannot Do Work!\n");
        }
    }

    public void turnOn() {
        System.out.print("Streaming ");
        pc.turnOn();
    }
    public void turnOff(){
        System.out.print("Streaming ");
        pc.turnOff();
    }
}
