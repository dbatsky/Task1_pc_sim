package com.homework;

import java.util.ArrayList;
import java.util.List;

// flyweight factory
public class CPUFactory {
    // list of all available cpu models
    static private List<CPUModel> CPUModels = new ArrayList<CPUModel>();

    // interface for retrieving the CPU model from the list, given company and model as input
    static public CPUModel getCPUModel(String company, String model){
        for (CPUModel cpumodel : CPUModels) {
            if(cpumodel.getModel() == model && cpumodel.getCompany() == company) {
                return cpumodel;
            }
        }
        throw new IllegalArgumentException("GPU Model: " + company + " " + model + " doesn't exist!");
    }

    // interface for adding shared CPU models to the list
    static public void addCPUModel(String company, String model,float clockSpeed, int coreCount){
        for (CPUModel cpumodel : CPUModels) {
            if(cpumodel.getModel() == model && cpumodel.getCompany() == company) {
                System.out.println("CPU Model: " + company + " " + model + " already exists!");
                return;
            }
        }
        CPUModel newModel = new CPUModel(company, model, clockSpeed, coreCount);
        CPUModels.add(newModel);
        System.out.println("CPU Model: " + company + " " + model + " successfully added to the list!");
    }

}
