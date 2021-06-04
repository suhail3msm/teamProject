package com.hcl.teamProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Supplier")
public class Supplier {

	@Id
	@GeneratedValue
	@Column(name = "supplier_id")
	private Long supplier_id;

	@Column(name = "username", unique = true)
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "client_Code")
	private String client_Code;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "province")
	private String province;

	@Column(name = "country")
	private String country;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile")
	private long mobile;

	@Column(name = "credit")
	private String credit;

	@Column(name = "supplier_lmt")
	private String supplier_lmt;

	@Column(name = "invoice_payment")
	private String invoice_payment;

	public Supplier() {
		super();
	}

	public Supplier(String username, String password, String client_Code, String name, String address, String city,
			String province, String country, String email, long mobile, String credit, String supplier_lmt,
			String invoice_payment) {
		super();
		this.username = username;
		this.password = password;
		this.client_Code = client_Code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.province = province;
		this.country = country;
		this.email = email;
		this.mobile = mobile;
		this.credit = credit;
		this.supplier_lmt = supplier_lmt;
		this.invoice_payment = invoice_payment;
	}

	public Long getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(Long supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClient_Code() {
		return client_Code;
	}

	public void setClient_Code(String client_Code) {
		this.client_Code = client_Code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getSupplier_lmt() {
		return supplier_lmt;
	}

	public void setSupplier_lmt(String supplier_lmt) {
		this.supplier_lmt = supplier_lmt;
	}

	public String getInvoice_payment() {
		return invoice_payment;
	}

	public void setInvoice_payment(String invoice_payment) {
		this.invoice_payment = invoice_payment;
	}

}
