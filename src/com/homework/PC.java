package com.homework;

// the main pc class. Represents the PC
public class PC implements IPC {

    PCState state;

    public PCState getState(){
        return this.state;
    };

    public PC(){
        this.state = new PCStateIncomplete(this);
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
