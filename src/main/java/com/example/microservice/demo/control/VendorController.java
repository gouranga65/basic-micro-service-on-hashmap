package com.example.microservice.demo.control;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.demo.entity.Vendor;
import com.example.microservice.demo.vendorService.VendorService;

@RestController
public class VendorController {
    @Autowired
    private VendorService service;

    @RequestMapping("/okie")

    public HashMap<String, Vendor> getAll() {
        return service.allVendor();
    }

}
