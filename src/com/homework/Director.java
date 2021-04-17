package com.homework;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public PC buildAmdPC(){
        System.out.println("Building an AMD-based pc...");
        GPU gpu = new GPU("RX5700XT");
        System.out.println("Setting GPU: " + gpu.toString());
        this.builder.setGPU(gpu);
        CPU cpu = new CPU("R7 3800X");
        this.builder.setCPU(cpu);
        PSU psu = new PSU(700);
        this.builder.setPSU(psu);
        return this.builder.buildPC();
    }

    public PC buildNvidiaPC(){
        System.out.println("Building an Nvidia-based pc...");
        GPU gpu = new GPU("RX5700XT");
        this.builder.setGPU(gpu);
        CPU cpu = new CPU("R7 3800X");
        this.builder.setCPU(cpu);
        PSU psu = new PSU(700);
        this.builder.setPSU(psu);
        return this.builder.buildPC();
    }
}
