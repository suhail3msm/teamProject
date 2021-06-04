package com.hcl.teamProject.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.teamProject.model.Client;
import com.hcl.teamProject.model.Invoice;
import com.hcl.teamProject.service.ClientService;
import com.hcl.teamProject.service.InvoiceService;

@RestController
@CrossOrigin
@RequestMapping("register/client")
public class ClientController {

	@Autowired
	ClientService clientService;

	@Autowired
	InvoiceService invoiceService;

	@PostMapping("/save")
	public Client saveClient(@RequestBody Client client) throws Exception {

		String tempUsername = client.getUsername();
		if (tempUsername != null && !"".equals(tempUsername)) {
			Client usernameObj = clientService.fetchByUsername(tempUsername);
			if (usernameObj != null) {
				throw new Exception("Client with " + tempUsername + " is already exist");
			}
		}

		Client usernameObj = null;
		usernameObj = clientService.saveClient(client);
		return usernameObj;
	}

	@PostMapping("/login")
	public Client loginClient(@RequestBody Client client, HttpServletRequest request) throws Exception {
		String tempUsername = client.getUsername();
		String tempPasswort = client.getPassword();
		Client clientObj = null;
		if (tempUsername != null && tempPasswort != null) {
			clientObj = clientService.fetchByUsernameAndPassword(tempUsername, tempPasswort);

		}

		if (clientObj == null) {
			throw new Exception("bad credentials");
		}

		HttpSession session = request.getSession();
		session.setAttribute("clientUN", tempUsername);

		return clientObj;
	}

	@PostMapping("/save_invoice")
	public Invoice seveInvoice(@RequestBody Invoice invoice, HttpSession session) {

		String clientUN = (String) session.getAttribute("clientUN");
		invoice.setUsername(clientUN);
		invoice = invoiceService.saveInvoice(invoice);
		return invoice;

	}

	@GetMapping("/findInvoice")
	public List<Invoice> getInvoice(HttpSession session) {
		String clientUN = (String) session.getAttribute("clientUN");
		List invoiceObj = invoiceService.fetchByUsername(clientUN);
		return invoiceObj;

	}

	@PutMapping("/findInvoice/update")
	public Invoice UpdateInvoice(@RequestBody Invoice invoice) {

		return invoiceService.saveInvoice(invoice);

	}

	@DeleteMapping("/findInvoice/delete/{id}")
	public ResponseEntity<?> deleteInvoice(@PathVariable("id") Long id) {
		invoiceService.DeleteInvoice(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping("/findInvoice/{id}")
	public Optional findInvoiceById(@PathVariable("id") Long id) {
		return invoiceService.findInviceById(id);

	}
}
