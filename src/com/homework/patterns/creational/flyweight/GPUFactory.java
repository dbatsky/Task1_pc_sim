package com.homework.patterns.creational.flyweight;

import com.homework.domain.GPUModel;

import java.util.HashMap;
import java.util.Map;

// flyweight factory
public class GPUFactory {
    // list of all available gpu models
    static private Map<String, GPUModel> GPUModels = new HashMap<>();

    // interface for retrieving the GPU model from the list, given the model as input
    static public GPUModel getGPUModel(String model) {
        GPUModel gpuModel = GPUModels.get(model);
        if (gpuModel == null) {
            throw new IllegalArgumentException("GPU model doesn't exist!");
        }
        return gpuModel;
    }

    // interface for adding shared GPU models to the list
    static public void addGPUModel(String company, String model, float coreClock, float memoryClock, int memorySize) {
        // if gpu model already exists
        if (GPUModels.values().stream().anyMatch(existingModel ->
                existingModel.getModel().equals(model) && existingModel.getCompany().equals(company))) {
            System.out.println("GPU Model: " + company + " " + model + " already exists!");
            return;
        }

        GPUModel newModel = new GPUModel(company, model, coreClock, memoryClock, memorySize);
        GPUModels.put(model, newModel);
        System.out.println("GPU Model: " + company + " " + model + " successfully added to the list!");
    }


}
