package com.homework.patterns.creational.builder;

import com.homework.domain.CPU;
import com.homework.domain.GPU;
import com.homework.domain.PC;
import com.homework.domain.PSU;

public class PCBuilder implements Builder {

    private PC pc = new PC();

    @Override
    public Builder setCPU(CPU cpu) {
        pc.cpu = cpu;
        return this;
    }

    @Override
    public Builder setGPU(GPU gpu) {
        pc.gpu = gpu;
        return this;
    }

    @Override
    public Builder setPSU(PSU psu) {
        pc.psu = psu;
        return this;
    }

    @Override
    public PC buildPC() {
        PC pc = this.pc;
        this.reset();
        return pc;
    }

    @Override
    public void reset() {
        this.pc = new PC();
    }

}
