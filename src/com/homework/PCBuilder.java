package com.homework;

// pc builder used for building the PC
// used by chaining operations like
/*
 PC newPC = new PCBuilder()
                 .buildCPU(cpu)
                 .buildGPU(gpu)
                 ...
                 .getPC();
 */
public class PCBuilder implements Builder{

    CPU cpu;
    GPU gpu;
    PSU psu;

    @Override
    public Builder buildCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public Builder buildGPU(GPU gpu){
        this.gpu = gpu;
        return this;
    }

    @Override
    public Builder buildPSU(PSU psu) {
        this.psu = psu;
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
