package com.homework;

// Concrete Decorator
public class PCStreamingDecorator extends PCDecorator {
    public PCStreamingDecorator(IPC computer) {
        this.pc = computer;
    }

    @Override
    public void doWork(){
        pc.doWork();
        System.out.print("Streaming... ");
    }
}
