package com.hcl.teamProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.teamProject.model.Supplier;
import com.hcl.teamProject.repository.SupplierRepository;
import com.hcl.teamProject.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierRepository supplierRepository;

	@Override
	public Supplier saveSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
	}

	@Override
	public Supplier fetchByUsernameAndPassword(String username, String password) {
		return supplierRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public Supplier fetchByUsername(String username) {
		return supplierRepository.findByUsername(username);
	}

}
