package com.homework.domain;

import com.homework.patterns.behavioral.state.PCState;
import com.homework.patterns.behavioral.state.PCStateOFF;

// the main pc class. Represents the PC
public class PC implements IPC {

    PCState state;
    public GPU gpu;
    public PSU psu;
    public CPU cpu;

    public PCState getState() {
        return this.state;
    }


    public PC() {
        this.state = new PCStateOFF(this);
    }

    public void turnOn() {
        this.state.turnOn();
    }

    public void turnOff() {
        this.state.turnOff();
    }

    public void changeState(PCState state) {
        this.state = state;
    }

    public void doWork() {
        this.state.doWork();
    }

}
