package com.homework.domain;

import com.homework.patterns.creational.flyweight.CPUFactory;

public class CPU {
    // cpu can be overclocked, so each computer has a cpu with its own clock speed
    private float clockSpeed;
    CPUModel model;

    public CPU(String model) {
        // instead of creating a whole new CPUModel object, we want to use one from the pool, as
        // many options are shared between them
        CPUModel cpu = CPUFactory.getCPUModel(model);
        this.model = cpu;
        this.clockSpeed = cpu.defaultClockSpeed;
    }

    @Override
    public String toString() {
        return String.format("Model: %s", this.model.toString());
    }
}
