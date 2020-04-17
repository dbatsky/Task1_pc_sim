package com.homework;

// the abstract common Decorator class
abstract public class PCDecorator implements IPC{
    protected IPC pc;
    abstract public void doWork();
    public PCState getState(){
       return this.pc.getState();
    }
}
