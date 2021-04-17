package com.homework;

// builder interface
interface Builder {

    Builder setCPU(CPU cpu);
    Builder setGPU(GPU gpu);
    Builder setPSU(PSU psu);


    PC buildPC();

    void reset();
}
