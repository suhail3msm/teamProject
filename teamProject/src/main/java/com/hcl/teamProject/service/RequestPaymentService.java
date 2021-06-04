package com.hcl.teamProject.service;

import java.util.List;
import java.util.Optional;

import com.hcl.teamProject.model.Rqpayment;

public interface RequestPaymentService {
	Rqpayment saveRequestPayment(Rqpayment requestPayment);

	List<Rqpayment> fetchByUsername(String username);

	Rqpayment UpdateRequestPayment(Rqpayment requestPayment);

	void DeleteRequestPayment(Long id);

	Optional findRequestPaymentById(Long id);
}
