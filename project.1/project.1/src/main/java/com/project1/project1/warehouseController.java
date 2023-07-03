package com.project1.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/warehouse")
@CrossOrigin(origins = "http://localhost:3001")
public class warehouseController {
	  @Autowired
	    private warehouseRepository warehouseRepository;

	    @GetMapping
	    public List<warehouse> getAllSuppliers() {
	        return warehouseRepository.findAll();
	    }
	}


