package com.hcl.teamProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.teamProject.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

	Supplier findByUsernameAndPassword(String username, String password);

	Supplier findByUsername(String username);

}
