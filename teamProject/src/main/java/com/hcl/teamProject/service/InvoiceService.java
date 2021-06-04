package com.hcl.teamProject.service;

import java.util.List;
import java.util.Optional;

import com.hcl.teamProject.model.Invoice;

public interface InvoiceService {

	Invoice saveInvoice(Invoice invoice);

	List<Invoice> fetchByUsername(String username);

	Invoice UpdateInvaice(Invoice invoice);

	void DeleteInvoice(Long id);

	Optional findInviceById(Long id);
}
