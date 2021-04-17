package com.homework;

// flyweight
class GPUModel {
    private String model;
    private String company;
    protected float defaultCoreClock;
    protected float defaultMemoryClock;
    protected int memorySize;

    GPUModel(String company, String model, float coreClock, float memoryClock, int memorySize) {
        this.company = company;
        this.model = model;
        this.memorySize = memorySize;
        setDefaults(coreClock, memoryClock);
    }
    public void setDefaults(float coreClock, float memoryClock){
        this.defaultCoreClock = coreClock;
        this.defaultMemoryClock = memoryClock;
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
