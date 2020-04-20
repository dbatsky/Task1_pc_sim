package com.homework;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public PC buildPC(){
        this.builder.buildCPU();
        this.builder.buildGPU();
        this.builder.buildPSU();
        return this.builder.getPC();
    }

}
