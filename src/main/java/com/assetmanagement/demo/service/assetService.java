package com.assetmanagement.demo.service;

import com.assetmanagement.demo.model.asset;
import com.assetmanagement.demo.repository.assetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class assetService {

    @Autowired                          //Auto-wiring the repository
    assetRepository assetRepository;

    //Function to retrieve all assets
    public List<asset> getAllAsset() {
        List<asset> assets = new ArrayList<asset>();
        assetRepository.findAll().forEach(asset -> assets.add((asset) asset));
        return assets;
    }

    //Function to retrieve asset by id which is name in asset
    public asset getAssetById(int id) {
        return assetRepository.findById(id).get();
    }

    //Function to delete asset by id
    public void delete(int id){
        assetRepository.deleteById(id);
    }

    //Function to update an asset
    public void saveOrUpdate(asset asset) {
        assetRepository.save(asset);
    }

    //Function to assign an asset to employee
    public void assignAsset(String name, int empID) {
        asset asset = getAssetById(empID);
        asset.setAssignmentStatus("Assigned");
        asset.setAssignedEmployeeId(empID);
        saveOrUpdate(asset);
    }

    //Function to recover an asset from an employee
    public void recoverAsset(int id) {
        asset asset = getAssetById(id);
        asset.setAssignmentStatus("Recovered");
        saveOrUpdate(asset);
    }
}
