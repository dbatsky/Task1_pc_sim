package com.homework;

// Facade class for some calling some low-level initializations/operations
public class PCFacade {
    // Singleton instance
    private PCFacade instance;

    // Director instance for building
    private Director director;

    // private constructor!
    private PCFacade(){}

    public PCFacade getInstance(){
        if(this.instance == null){
            this.instance = new PCFacade();
        }
        return this.instance;
    }

    public void initFlyweights(){
        // under construction
    }


}
