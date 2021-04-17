package com.homework.patterns.creational.builder;

import com.homework.domain.CPU;
import com.homework.domain.GPU;
import com.homework.domain.PC;
import com.homework.domain.PSU;

// builder interface
interface Builder {

    Builder setCPU(CPU cpu);
    Builder setGPU(GPU gpu);
    Builder setPSU(PSU psu);


    PC buildPC();

    void reset();
}
