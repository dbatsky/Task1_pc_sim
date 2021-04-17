package com.homework;

// the main pc class. Represents the PC
public class PC implements IPC {

    PCState state;
    GPU gpu;
    PSU psu;
    CPU cpu;

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
