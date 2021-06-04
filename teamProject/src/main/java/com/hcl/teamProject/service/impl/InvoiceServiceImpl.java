package com.hcl.teamProject.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.teamProject.model.Invoice;
import com.hcl.teamProject.repository.InvoiceRepository;
import com.hcl.teamProject.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;

	@Override
	public Invoice saveInvoice(Invoice invoice) {
		return invoiceRepository.save(invoice);

	}

	@Override
	public List<Invoice> fetchByUsername(String username) {

		return invoiceRepository.findByUsername(username);
	}

	@Override
	public Invoice UpdateInvaice(Invoice invoice) {
		return invoiceRepository.save(invoice);

	}

	@Override
	public void DeleteInvoice(Long id) {
		invoiceRepository.deleteById(id);
	}

	@Override
	public Optional<Invoice> findInviceById(Long id) {
		return invoiceRepository.findById(id);

	}
}
