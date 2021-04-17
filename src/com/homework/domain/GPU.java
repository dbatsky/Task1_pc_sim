package com.homework.domain;

import com.homework.patterns.creational.flyweight.GPUFactory;

public class GPU {
    // gpu can be overclocked, so each instance has, in addition to it's model, a current voltage/clock values
    private float memoryClock;
    private float coreClock;

    GPUModel model;

    // default values are those that are set for each GPU model by the manufacturer
    public GPU(String model){
        GPUModel flyweightGpuModel = GPUFactory.getGPUModel(model);
        this.model = flyweightGpuModel;
        this.memoryClock = flyweightGpuModel.defaultMemoryClock;
        this.coreClock = flyweightGpuModel.defaultCoreClock;
    }

    public int getModelMemorySize(){
        return model.memorySize;
    }

    public float getMemoryClock() {
        return memoryClock;
    }

    public void setMemoryClock(float memoryClock) {
        this.memoryClock = memoryClock;
    }

    public float getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(float coreClock) {
        this.coreClock = coreClock;
    }

    @Override
    public String toString() {
        return String.format("Model: %s", this.model.toString());
    }
}
