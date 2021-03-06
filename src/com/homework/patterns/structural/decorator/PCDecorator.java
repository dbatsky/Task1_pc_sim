package com.homework.patterns.structural.decorator;

import com.homework.domain.IPC;

// the abstract common Decorator class
/*
Decorator is used to decorate an object, like:
        IPC computer = new PC();
        computer.doWork(); <- regular method
        computer = new PCGamingDecorator(computer);
        computer.doWork(); <- decorated method
 */
public class PCDecorator implements IPC {
    protected IPC pc;

    public PCDecorator(IPC sourcePC) {
        this.pc = sourcePC;
    }

    @Override
    public void doWork() {
        pc.doWork();
    }

    @Override
    public void turnOn() {
        pc.turnOn();
    }

    @Override
    public void turnOff() {
        pc.turnOff();
    }
}
