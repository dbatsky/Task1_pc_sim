package com.homework;

public class PCStreamingDecorator extends PCDecorator {
    public PCStreamingDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public String doWork(){
        return pc.doWork() + "Streaming... ";
    }
}
