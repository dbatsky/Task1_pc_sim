package com.homework;

public class pc_sim_test {
    public static void main(String[] args) {
        IPC computer = new PC();
        computer.doWork();

        computer = new PCGamingDecorator(computer);
        computer.doWork();

        computer = new PCStreamingDecorator(computer);
       computer.doWork();

        computer = new PCMiningDecorator(computer);
        computer.doWork();
    }
}
