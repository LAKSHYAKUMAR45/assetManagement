package com.assetmanagement.demo.service;

import com.assetmanagement.demo.model.Category;
import com.assetmanagement.demo.repository.categoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.assetmanagement.demo.repository.assetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class categoryService {

    @Autowired                                  //Auto-wiring the repository
    categoryRepository categoryRepository;

    //Function to retrieve category by id

    public Category getCategoryById(int id) {

        return categoryRepository.findById(id).get();
    }

    //Function to update category by id
    public void saveOrUpdate(Category category) {

        categoryRepository.save(category);
    }
}
