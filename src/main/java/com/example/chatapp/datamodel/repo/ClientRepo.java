package com.example.chatapp.datamodel.repo;

import com.example.chatapp.datamodel.Admin;
import com.example.chatapp.datamodel.Client;
import com.example.chatapp.domain.Inbound.ClientDTOIn;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepo extends PagingAndSortingRepository<Client,Long> {
    Client findByEmailAndPassword(String email,String password);
    Client findByEmail(String email);

}
