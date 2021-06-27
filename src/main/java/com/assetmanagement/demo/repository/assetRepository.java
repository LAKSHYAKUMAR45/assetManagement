package com.assetmanagement.demo.repository;

import com.assetmanagement.demo.model.asset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Implementation of Crud Repo for basic pre-defined functions
@Repository
public interface assetRepository extends CrudRepository<asset,Integer> {
}
