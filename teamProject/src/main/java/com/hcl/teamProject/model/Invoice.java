package com.hcl.teamProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Invoice")
public class Invoice {

	@Id
	@GeneratedValue
	@Column(name = "invoice_id")
	private Long invoice_id;

	@Column(name = "supplier_code")
	private String supplier_code;

	@Column(name = "invoice_number")
	private String invoice_number;

	@Column(name = "invoice_date")
	private String invoice_date;

	@Column(name = "invoice_amount")
	private String invoice_amount;

	@Column(name = "currency")
	private String currency;

	@Column(name = "invoice_payment")
	private String invoice_payment;

	@Column(name = "invoice_file_url")
	private String invoice_file_url;

	@Column(name = "username")
	private String username;

	public Invoice() {
		super();
	}

	public Invoice(String supplier_code, String invoice_number, String invoice_date, String invoice_amount,
			String currency, String invoice_payment, String invoice_file_url) {
		super();
		this.supplier_code = supplier_code;
		this.invoice_number = invoice_number;
		this.invoice_date = invoice_date;
		this.invoice_amount = invoice_amount;
		this.currency = currency;
		this.invoice_payment = invoice_payment;
		this.invoice_file_url = invoice_file_url;
	}

	public Long getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(Long invoice_id) {
		this.invoice_id = invoice_id;
	}

	public String getSupplier_code() {
		return supplier_code;
	}

	public void setSupplier_code(String supplier_code) {
		this.supplier_code = supplier_code;
	}

	public String getInvoice_number() {
		return invoice_number;
	}

	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}

	public String getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}

	public String getInvoice_amount() {
		return invoice_amount;
	}

	public void setInvoice_amount(String invoice_amount) {
		this.invoice_amount = invoice_amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInvoice_payment() {
		return invoice_payment;
	}

	public void setInvoice_payment(String invoice_payment) {
		this.invoice_payment = invoice_payment;
	}

	public String getInvoice_file_url() {
		return invoice_file_url;
	}

	public void setInvoice_file_url(String invoice_file_url) {
		this.invoice_file_url = invoice_file_url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
