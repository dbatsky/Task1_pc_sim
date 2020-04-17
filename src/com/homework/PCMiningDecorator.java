package com.homework;

// Concrete Decorator
public class PCMiningDecorator extends PCDecorator{
    public PCMiningDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public void doWork(){
        pc.doWork();
        System.out.print("Mining... ");
    }
}
