package com.homework;

// Facade class for some calling some low-level initializations/operations
public class PCFacade {
    // Singleton instance
    private static PCFacade instance;

    // private constructor!
    private PCFacade(){}

    public static PCFacade getInstance(){
        if(instance == null){
            instance = new PCFacade();
        }
        return instance;
    }

    public void initFlyweights(){
        // This does violate the Open/Closed principle - if one wanted to add more GPU/CPU models, existing code
        // would have to change, however, in a real world application this method call would get the data from an
        // existing database, dynamically - so there would be no violation, as in the future only the database
        // would have to be extended, with no code changes
        GPUFactory.addGPUModel("AMD", "RX5700XT", 1605, 1750, 8);
        GPUFactory.addGPUModel("NVIDIA", "RTX2080TI", 1350, 1750, 11);
        CPUFactory.addCPUModel("AMD", "R7 3800X", 3.9f, 8);
        CPUFactory.addCPUModel("AMD", "R5 3600", 3.6f, 6);
    }

}
