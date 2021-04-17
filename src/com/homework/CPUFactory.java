package com.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// flyweight factory
public class CPUFactory {
    // list of all available cpu models
    static private Map<String, CPUModel> CPUModels = new HashMap<>();

    // retrieving the CPU model from the list, given company and model as input
    static public CPUModel getCPUModel(String model) {
        CPUModel cpuModel = CPUModels.get(model);
        if (cpuModel == null) {
            throw new IllegalArgumentException("GPU Model: " + model + " doesn't exist!");
        }
        return cpuModel;
    }

    //  adding shared CPU models to the list
    static public void addCPUModel(String company, String model, float clockSpeed, int coreCount) {
        for (CPUModel cpumodel : CPUModels.values()) {
            if (cpumodel.getModel().equals(model) && cpumodel.getCompany().equals(company)) {
                System.out.println("CPU Model: " + company + " " + model + " already exists!");
                return;
            }
        }
        CPUModel newModel = new CPUModel(company, model, clockSpeed, coreCount);
        CPUModels.put(model, newModel);
        System.out.println("CPU Model: " + company + " " + model + " successfully added to the list!");
    }

}
