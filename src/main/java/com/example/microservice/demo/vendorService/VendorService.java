package com.example.microservice.demo.vendorService;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.microservice.demo.entity.Vendor;

@Component
public class VendorService {
    private HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();
    @Autowired
    private Vendor ven1;
    @Autowired
    private Vendor ven2;
    @Autowired
    private Vendor ven3;

    private void fillVendores() {
        vendors.put("1", ven1);
        vendors.put("2", ven2);
        vendors.put("3", ven3);
    }

    public VendorService() {
        fillVendores();
    }

    public HashMap<String, Vendor> allVendor() {
        return vendors;
    }

    public Vendor getById(String vendorId) {
        return vendors.get(vendorId);
    }

    public Vendor addVendor(Vendor newVendor) {
        vendors.put("4", newVendor);
        return newVendor;

    }

    public Vendor updateVendor(String vendorId, Vendor vendorData) {
        vendors.put(vendorId, vendorData);
        return vendorData;

    }

    public void deleteVendor(String VendorId) {
        vendors.remove(VendorId);
    }

}
