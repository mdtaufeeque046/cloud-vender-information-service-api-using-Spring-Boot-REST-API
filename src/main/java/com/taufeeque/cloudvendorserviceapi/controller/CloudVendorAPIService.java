package com.taufeeque.cloudvendorserviceapi.controller;

import com.taufeeque.cloudvendorserviceapi.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
        //new CloudVendor("C1", "Vendor 1", "Hyderabad", "7667325609");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created Successfully !!!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Details Updated Successfully !!!";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor Details Deleted Successfully !!!";
    }
}
