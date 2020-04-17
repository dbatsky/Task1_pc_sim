package com.homework;

// Concrete Decorator
public class PCGamingDecorator extends PCDecorator {
    public PCGamingDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public void doWork(){
        pc.doWork();
        System.out.print("Gaming... ");
    }
}
