package com.hcl.teamProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rqpayment")
public class Rqpayment {

	@Id
	@GeneratedValue
	@Column(name = "request_id")
	private Long request_id;

	@Column(name = "invoice_Number")
	private String invoice_Number;

	@Column(name = "invoice_Amount")
	private String invoice_Amount;

	@Column(name = "invoice_Payment")
	private String invoice_Payment;

	@Column(name = "invoice_Date")
	private String invoice_Date;

	@Column(name = "currency")
	private String currency;

	@Column(name = "username")
	private String username;

	public Rqpayment() {
		super();
	}

	public Rqpayment(String invoice_Number, String invoice_Amount, String invoice_Payment, String invoice_Date,
			String currency) {
		super();
		this.invoice_Number = invoice_Number;
		this.invoice_Amount = invoice_Amount;
		this.invoice_Payment = invoice_Payment;
		this.invoice_Date = invoice_Date;
		this.currency = currency;
	}

	public Long getRequest_id() {
		return request_id;
	}

	public void setRequest_id(Long request_id) {
		this.request_id = request_id;
	}

	public String getInvoice_Number() {
		return invoice_Number;
	}

	public void setInvoice_Number(String invoice_Number) {
		this.invoice_Number = invoice_Number;
	}

	public String getInvoice_Amount() {
		return invoice_Amount;
	}

	public void setInvoice_Amount(String invoice_Amount) {
		this.invoice_Amount = invoice_Amount;
	}

	public String getInvoice_Payment() {
		return invoice_Payment;
	}

	public void setInvoice_Payment(String invoice_Payment) {
		this.invoice_Payment = invoice_Payment;
	}

	public String getInvoice_Date() {
		return invoice_Date;
	}

	public void setInvoice_Date(String invoice_Date) {
		this.invoice_Date = invoice_Date;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
