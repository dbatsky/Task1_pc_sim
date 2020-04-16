package com.homework;

abstract public class PCDecorator implements IPC{
    protected IPC pc;
    abstract public String doWork();
}
