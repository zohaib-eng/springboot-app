package com.example.chatapp.services;

import com.example.chatapp.domain.Inbound.MessageRecieveDTOIn;
import com.example.chatapp.domain.Inbound.MessageSenderDTOIn;
import com.example.chatapp.domain.MessageRecieveDTO;

public interface IMessageSenderService {
    void createMessageSender(MessageSenderDTOIn messageSenderDTOIn);

    MessageRecieveDTO message(MessageRecieveDTOIn messageRecieveDTOIn);

}
