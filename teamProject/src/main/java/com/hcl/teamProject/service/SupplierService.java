package com.hcl.teamProject.service;

import com.hcl.teamProject.model.Supplier;

public interface SupplierService {
	Supplier saveSupplier(Supplier supplier);

	Supplier fetchByUsernameAndPassword(String username, String password);

	Supplier fetchByUsername(String username);
}
