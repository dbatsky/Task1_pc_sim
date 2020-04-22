package com.homework;

// the PC interface - common between the PC and various PC Decorations
interface IPC {
    public void doWork(String output);
    public void turnOn();
    public void turnOff();
}