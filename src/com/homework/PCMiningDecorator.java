package com.homework;

// Concrete Decorator
public class PCMiningDecorator extends PCDecorator{
    public PCMiningDecorator(IPC computer) {
        this.pc = computer;
    }

    public void doWork(String output){
        output = "Mining... " + output;
        this.pc.doWork(output);
    }

    public void turnOn() {
        System.out.print("Mining ");
        pc.turnOn();
    }
    public void turnOff(){
        System.out.print("Mining ");
        pc.turnOff();
    }

}
