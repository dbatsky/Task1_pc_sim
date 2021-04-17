package com.homework.domain;

// flyweight
public class CPUModel {
    private String model;
    private String company;
    protected float defaultClockSpeed;
    private int coreCount;

    public CPUModel(String company, String model, float clockSpeed, int coreCount) {
        this.company = company;
        this.model = model;
        this.defaultClockSpeed = clockSpeed;
        this.coreCount = coreCount;
    }

    public String getModel(){
        return model;
    }

    public String getCompany(){
        return company;
    }

    @Override
    public String toString() {
        return String.format("Company: %s, Model: %s", company, model);
    }
}
