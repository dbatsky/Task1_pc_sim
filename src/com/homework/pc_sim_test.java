package com.homework;

public class pc_sim_test {
    public static void main(String[] args) {
        // getting facade instance
        PCFacade facade = PCFacade.getInstance();

        // adding flyweights to the pool
        facade.initFlyweights();

        // manual PC creation using builder
        IPC computer = new PCBuilderManual().buildGPU(new GPU(GPUFactory.getGPUModel("AMD", "RX5700XT")))
                                    .buildCPU(new CPU(CPUFactory.getCPUModel("AMD", "R7 3800X")))
                                    .buildPSU(new PSU(600))
                                    .getPC();

        // PC creation using builder (GoF)s
        Director director = new Director();
        director.setBuilder(new PCBuilder_AMD_High_End());
        IPC computer_2 = director.buildPC();

        computer.turnOff();
        computer.turnOn();
        computer.doWork("");
        computer = new PCGamingDecorator(computer);
        computer.doWork("");
        computer.turnOff();
        computer = new PCMiningDecorator(computer);
        computer.doWork("");
        computer.turnOn();
        computer.doWork("");

        computer_2 = new PCStreamingDecorator(computer_2);
        computer_2.turnOn();
        computer_2.doWork("");
    }
}
