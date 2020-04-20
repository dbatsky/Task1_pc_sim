package com.homework;

public class PCBuilder_AMD_High_End implements Builder {
    CPU cpu;
    GPU gpu;
    PSU psu;


    @Override
    public Builder buildCPU() {
        this.cpu = new CPU(CPUFactory.getCPUModel("AMD", "R7 3800X"));
        return this;
    }

    @Override
    public Builder buildGPU(){
        this.gpu = new GPU(GPUFactory.getGPUModel("AMD", "RX5700XT"));
        return this;
    }

    @Override
    public Builder buildPSU() {
        this.psu = new PSU(700);
        return this;
    }

    @Override
    public GPU getGPU() {
        return this.gpu;
    }

    @Override
    public PSU getPSU() {
        return this.psu;
    }


    @Override
    public CPU getCPU() {
        return this.cpu;
    }

    @Override
    public PC getPC() {
        if(cpu == null || gpu == null || psu == null) {
            throw new IllegalArgumentException("Cannot build PC - components missing!");
        }
        else
            return new PC(this);
    }
}
