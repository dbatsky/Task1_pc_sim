package com.homework;

public class pc_sim_test {
    public static void main(String[] args) {
        IPC computer = new PC();
        System.out.println(computer.doWork());

        computer = new PCGamingDecorator(computer);
        System.out.println(computer.doWork());

        computer = new PCStreamingDecorator(computer);
        System.out.println(computer.doWork());

        computer = new PCMiningDecorator(computer);
        System.out.println(computer.doWork());
    }
}
