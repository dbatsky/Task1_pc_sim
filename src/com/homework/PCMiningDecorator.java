package com.homework;

public class PCMiningDecorator extends PCDecorator{
    public PCMiningDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public String doWork(){
        return pc.doWork() + "Mining... ";
    }
}
