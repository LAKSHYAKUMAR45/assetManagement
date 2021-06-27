package com.assetmanagement.demo.repository;

import com.assetmanagement.demo.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Implementation of Crud Repo for basic pre-defined functions
@Repository
public interface categoryRepository extends CrudRepository<Category,Integer> {
}
