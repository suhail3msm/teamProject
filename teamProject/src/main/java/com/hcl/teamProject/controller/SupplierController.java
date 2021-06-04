package com.hcl.teamProject.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.teamProject.model.Rqpayment;
import com.hcl.teamProject.model.Supplier;
import com.hcl.teamProject.service.RequestPaymentService;
import com.hcl.teamProject.service.SupplierService;

@RestController
@RequestMapping("register/supplier")
public class SupplierController {

	@Autowired
	SupplierService supplierService;

	@Autowired
	RequestPaymentService requestPaymentService;

	@PostMapping("/save")
	public Supplier saveSupplier(@RequestBody Supplier supplier) throws Exception {

		String tempUsername = supplier.getUsername();
		if (tempUsername != null && !"".equals(tempUsername)) {
			Supplier usernameObj = supplierService.fetchByUsername(tempUsername);
			if (usernameObj != null) {
				throw new Exception("Client with " + tempUsername + " is already exist");
			}
		}

		Supplier usernameObj = null;
		usernameObj = supplierService.saveSupplier(supplier);
		return usernameObj;
	}

	@PostMapping("/login")
	public Supplier loginSupplier(@RequestBody Supplier supplier, HttpServletRequest request) throws Exception {
		String tempUsername = supplier.getUsername();
		String tempPasswort = supplier.getPassword();
		Supplier supplierObj = null;
		if (tempUsername != null && tempPasswort != null) {
			supplierObj = supplierService.fetchByUsernameAndPassword(tempUsername, tempPasswort);

		}

		if (supplierObj == null) {
			throw new Exception("bad credentials");
		}
		HttpSession session = request.getSession();
		session.setAttribute("supplierUN", tempUsername);
		return supplierObj;
	}

	@PostMapping("/saveRequestPayment")
	public Rqpayment seveRequestPayment(@RequestBody Rqpayment requestPayment, HttpSession session) {

		String supplierUN = (String) session.getAttribute("supplierUN");
		requestPayment.setUsername(supplierUN);
		requestPayment = requestPaymentService.saveRequestPayment(requestPayment);
		return requestPayment;

	}

	@GetMapping("/findRequestPayment")
	public List<Rqpayment> getRequestPayment(HttpSession session) {
		String supplierUN = (String) session.getAttribute("supplierUN");
		List requestPaymentObj = requestPaymentService.fetchByUsername(supplierUN);
		return requestPaymentObj;

	}

	@PutMapping("/findRequestPayment/update")
	public Rqpayment UpdateRequestPayment(@RequestBody Rqpayment requestPayment) {

		return requestPaymentService.UpdateRequestPayment(requestPayment);

	}

	@DeleteMapping("/findRequestPayment/delete/{id}")
	public ResponseEntity<?> deleteRequestPayment(@PathVariable("id") Long id) {
		requestPaymentService.DeleteRequestPayment(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/findRequestPayment/{id}")
	public Optional findRequestPaymentById(@PathVariable("id") Long id) {
		return requestPaymentService.findRequestPaymentById(id);

	}
}
