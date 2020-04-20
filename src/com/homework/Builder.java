package com.homework;

// builder interface
interface Builder {
    public Builder buildCPU();
    public Builder buildGPU();
    public Builder buildPSU();


    public GPU getGPU();
    public PSU getPSU();
    public CPU getCPU();


    public PC getPC();
}
