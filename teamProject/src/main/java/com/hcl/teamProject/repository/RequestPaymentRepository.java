package com.hcl.teamProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.teamProject.model.Rqpayment;

@Repository
public interface RequestPaymentRepository extends JpaRepository<Rqpayment, Long> {

	List<Rqpayment> findByUsername(String username);

}
