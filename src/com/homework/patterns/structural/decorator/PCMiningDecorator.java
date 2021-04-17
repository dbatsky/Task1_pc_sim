package com.homework.patterns.structural.decorator;

import com.homework.domain.IPC;

// Concrete Decorator
public class PCMiningDecorator extends PCDecorator {

    public PCMiningDecorator(IPC computer) {
        super(computer);
        System.out.println("Mining capabilities installed.");
    }

    public void doWork() {
        System.out.print("Mining...");
        this.pc.doWork();
    }

    public void turnOn() {
        System.out.print("Mining ");
        pc.turnOn();
    }

    public void turnOff() {
        System.out.print("Mining ");
        pc.turnOff();
    }

}
