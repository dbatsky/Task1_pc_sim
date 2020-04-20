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
public class PCBuilderManual {

    CPU cpu;
    GPU gpu;
    PSU psu;

    public PCBuilderManual buildCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }


    public PCBuilderManual buildGPU(GPU gpu){
        this.gpu = gpu;
        return this;
    }


    public PCBuilderManual buildPSU(PSU psu) {
        this.psu = psu;
        return this;
    }

    public GPU getGPU() {
        return this.gpu;
    }

    public PSU getPSU() {
        return this.psu;
    }

    public CPU getCPU() {
        return this.cpu;
    }

    public PC getPC() {
        if(cpu == null || gpu == null || psu == null) {
            throw new IllegalArgumentException("Cannot build PC - components missing!");
        }
        else
            return new PC(this);
    }



}
