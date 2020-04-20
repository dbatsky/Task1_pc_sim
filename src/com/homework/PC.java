package com.homework;

// the main pc class. Represents the PC
public class PC implements IPC {

    PCState state;
    GPU gpu;
    PSU psu;
    CPU cpu;

    public PCState getState(){
        return this.state;
    };

    public PC(Builder builder){
        this.state = new PCStateOFF(this);
        this.gpu = builder.getGPU();
        this.cpu = builder.getCPU();
        this.psu = builder.getPSU();
        System.out.println("New PC constructed!");
    }

    public PC(PCBuilderManual builder){
        this.state = new PCStateOFF(this);
        this.gpu = builder.getGPU();
        this.cpu = builder.getCPU();
        this.psu = builder.getPSU();
        System.out.println("New PC Manually constructed!");
    }

    public void turnOn(){
        this.state.turnOn();
    }

    public void turnOff(){
        this.state.turnOff();
    }

    public void changeState(PCState state){
        this.state = state;
    }

    public void doWork() {
        if(getState() instanceof PCStateON) {
            System.out.print("\nWorking... ");
        }
        else
        {
            System.out.println("The PC isn't ON - Cannot Do Work!");
        }
    }
}
