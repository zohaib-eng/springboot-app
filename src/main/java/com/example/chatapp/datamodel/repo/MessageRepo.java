package com.example.chatapp.datamodel.repo;

import com.example.chatapp.datamodel.MessageSender;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface MessageRepo extends PagingAndSortingRepository<MessageSender,Long> {
    MessageSender findByName(String Name);


}
