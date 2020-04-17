package com.homework;

public class PCBuilder implements Builder{

    CPU cpu;
    GPU gpu;
    MOBO mobo;
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
    public Builder buildMOBO(MOBO mobo) {
    this.mobo = mobo;
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
    public MOBO getMOBO() {
        return this.mobo;
    }

    @Override
    public CPU getCPU() {
        return this.cpu;
    }

    @Override
    public PC getPC() {
        if(cpu == null || gpu == null || psu == null || mobo == null) {
            throw new IllegalArgumentException("Cannot build PC - components missing!");
        }
        else
            return new PC(this);
    }



}
