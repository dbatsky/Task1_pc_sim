package com.homework.patterns.behavioral.state;

// State pattern - State Interface
/*
PC can exist in several states (ON/OFF)
which determines how method calls are handled
 */
public interface PCState {
    void turnOn();

    void turnOff();

    void doWork();
}
