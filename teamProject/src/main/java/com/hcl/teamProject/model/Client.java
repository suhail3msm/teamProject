package com.hcl.teamProject.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")
public class Client implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "client_id")
	private long client_id;

	@Column(name = "username", unique = true)
	private String username;

	@Column(name = "password")
	private String password;

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
	private String mobile;

	@Column(name = "loan_acc_num")
	private String loan_acc_num;

	@Column(name = "bank_code")
	private String bank_code;

	@Column(name = "client_limit")
	private String client_limit;

	@Column(name = "valid_from")
	private String valid_from;

	@Column(name = "valid_to")
	private String valid_to;

	@Column(name = "rate_of_interest")
	private String rate_of_interest;

	@Column(name = "credit_period")
	private String credit_period;

	public Client() {
		super();
	}

	public Client(String username, String password, String name, String address, String city, String province,
			String country, String email, String mobile, String loan_acc_num, String bank_code, String client_limit,
			String valid_from, String valid_to, String rate_of_interest, String credit_period) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.city = city;
		this.province = province;
		this.country = country;
		this.email = email;
		this.mobile = mobile;
		this.loan_acc_num = loan_acc_num;
		this.bank_code = bank_code;
		this.client_limit = client_limit;
		this.valid_from = valid_from;
		this.valid_to = valid_to;
		this.rate_of_interest = rate_of_interest;
		this.credit_period = credit_period;
	}

	public long getClient_id() {
		return client_id;
	}

	public void setClient_id(long client_id) {
		this.client_id = client_id;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLoan_acc_num() {
		return loan_acc_num;
	}

	public void setLoan_acc_num(String loan_acc_num) {
		this.loan_acc_num = loan_acc_num;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getClient_limit() {
		return client_limit;
	}

	public void setClient_limit(String client_limit) {
		this.client_limit = client_limit;
	}

	public String getValid_from() {
		return valid_from;
	}

	public void setValid_from(String valid_from) {
		this.valid_from = valid_from;
	}

	public String getValid_to() {
		return valid_to;
	}

	public void setValid_to(String valid_to) {
		this.valid_to = valid_to;
	}

	public String getRate_of_interest() {
		return rate_of_interest;
	}

	public void setRate_of_interest(String rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}

	public String getCredit_period() {
		return credit_period;
	}

	public void setCredit_period(String credit_period) {
		this.credit_period = credit_period;
	}

}
