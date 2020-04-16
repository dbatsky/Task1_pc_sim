package com.homework;

public class PCGamingDecorator extends PCDecorator {
    public PCGamingDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public String doWork(){
        return pc.doWork() + "Gaming... ";
    }
}
