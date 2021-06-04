package com.hcl.teamProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.teamProject.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findByUsername(String username);

	Client findByUsernameAndPassword(String username, String password);

}
