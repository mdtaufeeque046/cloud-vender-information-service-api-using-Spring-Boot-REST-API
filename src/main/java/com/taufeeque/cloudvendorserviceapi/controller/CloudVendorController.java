package com.taufeeque.cloudvendorserviceapi.controller;

import com.taufeeque.cloudvendorserviceapi.model.CloudVendor;
import com.taufeeque.cloudvendorserviceapi.response.ResponseHandler;
import com.taufeeque.cloudvendorserviceapi.service.CloudVendorService;
import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    // Cloud Vendor Service instance
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    // Read Specific Cloud Vendor Details
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        return ResponseHandler.responseBuilder("Requested Vendor Details are given here", HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
    }

    // Read All Cloud Vendor Details from the DB
    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();

    }


    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor created Successfully !!!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Details Updated Successfully !!!";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Details Deleted Successfully !!!";
    }
}
