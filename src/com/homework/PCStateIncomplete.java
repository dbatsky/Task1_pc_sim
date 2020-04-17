package com.homework;

// concrete state
public class PCStateIncomplete implements PCState {
    PC pc;
    public PCStateIncomplete(PC pc){
        this.pc = pc;
    }
    public void turnOn(){
        System.out.println("Cannot do Work - PC is Incomplete!");
    }
    public void turnOff(){
        System.out.println("Cannot turn OFF - PC is Incomplete!");
    }
}
