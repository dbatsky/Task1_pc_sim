package com.homework;

// Concrete state
public class PCStateOFF implements PCState {
    PC pc;
    public PCStateOFF(PC pc){
        this.pc = pc;
    }
    public void turnOn(){
        this.pc.changeState(new PCStateON(this.pc));
        System.out.println("PC has been turned ON!");
    }
    public void turnOff(){
        System.out.println("PC is already OFF!");
    }
    public void doWork(String output){
        System.out.println("Cannot do work - PC is OFF!");
    }
}
