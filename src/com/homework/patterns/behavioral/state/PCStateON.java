package com.homework.patterns.behavioral.state;

import com.homework.domain.PC;

// Concrete state
public class PCStateON implements PCState {

    PC pc;

    public PCStateON(PC pc) {
        this.pc = pc;
    }

    public void turnOn() {
        System.out.println("PC is already ON!");
    }

    public void turnOff() {
        this.pc.changeState(new PCStateOFF(this.pc));
        System.out.println("PC has been turned OFF!");
    }

    public void doWork() {
        System.out.println("Working... ");
    }
}
