package com.homework;

import com.homework.domain.IPC;
import com.homework.patterns.creational.builder.Director;
import com.homework.patterns.creational.builder.PCBuilder;
import com.homework.patterns.structural.facade.PCFacade;
import com.homework.patterns.structural.decorator.PCGamingDecorator;
import com.homework.patterns.structural.decorator.PCStreamingDecorator;

public class pc_sim_test {
    public static void main(String[] args) {
        // getting facade instance
        PCFacade facade = PCFacade.getFacadeSingleton();

        // adding GPU/CPU model flyweights to the pool, using the Facade
        facade.initFlyweights();

        // PC creation using builder (GoF)s
        Director director = new Director();
        PCBuilder pcBuilder = new PCBuilder();
        director.setBuilder(pcBuilder);

        System.out.println();

        IPC nvidiaPC = director.buildNvidiaPC();
        // changing PC states
        nvidiaPC.turnOn();
        nvidiaPC.turnOff();

        System.out.println();

        IPC amdPC = director.buildAmdPC();
        amdPC.turnOn();

        System.out.println();

        // Adding behavior by using Decorators
        // Working + Gaming PC
        amdPC = new PCGamingDecorator(amdPC);
        amdPC.doWork();
        System.out.println();
        // Working + Gaming + Streaming PC
        amdPC = new PCStreamingDecorator(amdPC);
        amdPC.doWork();
        System.out.println();

        amdPC.turnOff();
    }
}
