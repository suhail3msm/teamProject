package com.hcl.teamProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.teamProject.model.Client;
import com.hcl.teamProject.repository.ClientRepository;
import com.hcl.teamProject.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository clientRepository;

	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client fetchByUsername(String username) {
		return clientRepository.findByUsername(username);
	}

	@Override
	public Client fetchByUsernameAndPassword(String username, String password) {
		return clientRepository.findByUsernameAndPassword(username, password);

	}
}
