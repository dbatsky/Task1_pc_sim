package com.homework;

interface Builder {
    public Builder buildCPU(CPU cpu);
    public Builder buildGPU(GPU gpu);
    public Builder buildPSU(PSU psu);
    public Builder buildMOBO(MOBO mobo);

    public GPU getGPU();
    public PSU getPSU();
    public MOBO getMOBO();
    public CPU getCPU();


    public PC getPC();
}
