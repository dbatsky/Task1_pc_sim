package com.homework;

// builder interface
interface Builder {
    public Builder buildCPU(CPU cpu);
    public Builder buildGPU(GPU gpu);
    public Builder buildPSU(PSU psu);

    public GPU getGPU();
    public PSU getPSU();
    public CPU getCPU();


    public PC getPC();
}
