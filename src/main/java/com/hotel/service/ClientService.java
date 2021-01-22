package com.hotel.service;

import com.hotel.model.Client;
import com.hotel.repository.ClientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
    }

    public List<Client> getAll() {
       return clientRepository.findAll();
   }
}
