package com.hcl.teamProject.service;

import com.hcl.teamProject.model.Client;

public interface ClientService {
	Client saveClient(Client client);

	Client fetchByUsernameAndPassword(String username, String password);

	Client fetchByUsername(String username);
}
