package com.homework.patterns.structural.decorator;

import com.homework.domain.IPC;

// Concrete Decorator
public class PCStreamingDecorator extends PCDecorator {

    public PCStreamingDecorator(IPC computer) {
        super(computer);
        System.out.println("Streaming capabilities installed.");
    }

    public void doWork() {
        System.out.print("Streaming...");
        this.pc.doWork();
    }

    public void turnOn() {
        System.out.print("Streaming ");
        pc.turnOn();
    }

    public void turnOff() {
        System.out.print("Streaming ");
        pc.turnOff();
    }
}
