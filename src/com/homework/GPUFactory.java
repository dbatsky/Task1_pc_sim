package com.homework;

import java.util.ArrayList;
import java.util.List;

// flyweight factory
class GPUFactory {
    // list of all available gpu models
    static private List<GPUModel> GPUModels = new ArrayList<GPUModel>();

    // interface for retrieving the GPU model from the list, given company and model as input
    static public GPUModel getGPUModel(String company, String model){
        for (GPUModel gpumodel : GPUModels) {
            if(gpumodel.getModel() == model && gpumodel.getCompany() == company) {
                return gpumodel;
            }
        }
        throw new IllegalArgumentException("GPU model doesn't exist!");
    }

    // interface for adding shared GPU models to the list
    static public void addGPUModel(String company, String model, float coreClock, float memoryClock, int memorySize){
        for (GPUModel gpumodel : GPUModels) {
            if(gpumodel.getModel() == model && gpumodel.getCompany() == company) {
                System.out.println("GPU Model: " + company + " " + model + " already exists!");
                return;
            }
        }
        GPUModel newModel = new GPUModel(company, model, coreClock, memoryClock, memorySize);
        GPUModels.add(newModel);
        System.out.println("GPU Model: " + company + " " + model + " successfully added to the list!");
    }


}
