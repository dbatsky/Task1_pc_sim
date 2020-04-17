package com.homework;

// Concrete Decorator
public class PCMiningDecorator extends PCDecorator{
    public PCMiningDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public void doWork(){
        if(getState() instanceof PCStateON) {
            pc.doWork();
            System.out.print("Mining... ");
        }
        else
        {
            System.out.print("The PC isn't ON - Cannot Do Work!");
        }
    }

}
