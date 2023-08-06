package com.taufeeque.cloudvendorserviceapi.repository;

import com.taufeeque.cloudvendorserviceapi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
