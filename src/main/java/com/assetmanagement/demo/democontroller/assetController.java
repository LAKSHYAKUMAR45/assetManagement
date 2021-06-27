package com.assetmanagement.demo.democontroller;

import com.assetmanagement.demo.model.Category;
import com.assetmanagement.demo.model.asset;
import com.assetmanagement.demo.service.assetService;
import com.assetmanagement.demo.service.categoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class assetController {

    //Rest Controller for the service classes assetService and categoryService

    @Autowired                      // Auto-wiring to the assetService class
    assetService assetService;
    
    @Autowired                      // Auto-wiring to the categoryService class
    categoryService categoryService;

    //Rest operations for asset

    @GetMapping("/asset")
    private List<asset> getAllasset()
    {

        return assetService.getAllAsset();
    }
    @GetMapping("/asset/{id}")
    private asset getAsset(@PathVariable("id") int name)
    {

        return assetService.getAssetById(name);
    }

    @DeleteMapping
    private void deleteAsset(@PathVariable("id") int name)
    {
        assetService.delete(name);
    }

    @PostMapping("/updateAsset")
    private int updateAsset(asset asset)
    {
        assetService.saveOrUpdate(asset);
        return asset.getAssignedEmployeeId();
    }

   //Rest operation for categories

    @GetMapping("/category/{id}")
    private Category getCategory(@PathVariable("id") int id){

        return categoryService.getCategoryById(id);
    }

    @PostMapping("/updateCategory")
    private int updateCategoryAsset(Category category)
    {
        categoryService.saveOrUpdate(category);
        return category.getId();
    }


}
