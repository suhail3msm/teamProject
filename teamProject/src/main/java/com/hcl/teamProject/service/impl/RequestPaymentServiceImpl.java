package com.hcl.teamProject.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.teamProject.model.Rqpayment;
import com.hcl.teamProject.repository.RequestPaymentRepository;
import com.hcl.teamProject.service.RequestPaymentService;

@Service
public class RequestPaymentServiceImpl implements RequestPaymentService {

	@Autowired
	RequestPaymentRepository requestPaymentRepository;

	@Override
	public Rqpayment saveRequestPayment(Rqpayment requestPayment) {
		return requestPaymentRepository.save(requestPayment);
	}

	@Override
	public List<Rqpayment> fetchByUsername(String username) {
		return requestPaymentRepository.findByUsername(username);
	}

	@Override
	public Rqpayment UpdateRequestPayment(Rqpayment requestPayment) {

		return requestPaymentRepository.save(requestPayment);
	}

	@Override
	public void DeleteRequestPayment(Long id) {
		requestPaymentRepository.deleteById(id);

	}

	@Override
	public Optional findRequestPaymentById(Long id) {

		return requestPaymentRepository.findById(id);
	}

}
