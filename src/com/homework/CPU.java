package com.homework;

public class CPU {
    // cpu can be overclocked, so each computer has a cpu with its own clock speed
    private float clockSpeed;
    CPUModel model;

    CPU(CPUModel model){
        this.model = model;
        this.clockSpeed = this.model.defaultClockSpeed;
    }

}
