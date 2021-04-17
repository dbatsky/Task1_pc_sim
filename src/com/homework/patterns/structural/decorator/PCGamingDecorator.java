package com.homework.patterns.structural.decorator;

import com.homework.domain.IPC;

// Concrete Decorator
public class PCGamingDecorator extends PCDecorator {

    public PCGamingDecorator(IPC computer) {
        super(computer);
        System.out.println("Mining capabilities installed.");
    }

    public void doWork() {
        System.out.print("Gaming...");
        pc.doWork();
    }

    public void turnOn() {
        System.out.print("Gaming ");
        pc.turnOn();
    }

    public void turnOff() {
        System.out.print("Gaming ");
        pc.turnOff();
    }
}
