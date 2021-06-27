package com.assetmanagement.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class AssetManagementApplication {

	//Main class

	public static void main(String[] args) {

		SpringApplication.run(AssetManagementApplication.class, args);
	}

}
