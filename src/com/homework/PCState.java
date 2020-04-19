package com.homework;

// State pattern - State Interface
/*
PC can exist in several states (ON/OFF)
which determines how method calls are handled
 */
public interface PCState {
    public void turnOn();
    public void turnOff();
}
