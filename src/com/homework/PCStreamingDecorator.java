package com.homework;

// Concrete Decorator
public class PCStreamingDecorator extends PCDecorator {
    public PCStreamingDecorator(IPC computer) {
        this.pc = computer;
    }

    public void doWork(String output){
        output = "Streaming... " + output;
        this.pc.doWork(output);
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
