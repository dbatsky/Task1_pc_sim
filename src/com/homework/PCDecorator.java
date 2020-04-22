package com.homework;

// the abstract common Decorator class
/*
Decorator is used to decorate an object, like:
        IPC computer = new PC();
        computer.doWork(); <- regular method
        computer = new PCGamingDecorator(computer);
        computer.doWork(); <- decorated method
 */
abstract public class PCDecorator implements IPC {
    protected IPC pc;
}
