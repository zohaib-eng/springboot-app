package com.example.chatapp.services.impl;

import com.example.chatapp.datamodel.MessageSender;
import com.example.chatapp.datamodel.repo.MessageRepo;
import com.example.chatapp.domain.Inbound.MessageRecieveDTOIn;
import com.example.chatapp.domain.Inbound.MessageSenderDTOIn;
import com.example.chatapp.domain.MessageRecieveDTO;
import com.example.chatapp.services.IMessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderServiceImpl implements IMessageSenderService {
    @Autowired
    MessageRepo messageRepo;

    @Override
    public void createMessageSender(MessageSenderDTOIn messageSenderDTOIn){
        MessageSender m=new MessageSender();
        m.setMessage(messageSenderDTOIn.getMessage());
        m.setName(messageSenderDTOIn.getName());
        messageRepo.save(m);
    }

    public MessageRecieveDTO message(MessageRecieveDTOIn messageRecieveDTOIn){
        MessageRecieveDTO messageRecieveDTO=new MessageRecieveDTO(messageRecieveDTOIn.getMessage(),messageRecieveDTOIn.getName(),false);
        MessageSender m=messageRepo.findByName(messageRecieveDTOIn.getName());
        if(m!=null){
            messageRecieveDTO.setMessage(m.getMessage());
            messageRecieveDTO.setRecieve(true);
        }
        return messageRecieveDTO;
    }


    /*public LoginMessageDTO login(LoginMessageDTOIn loginMessageDTOIn) {
        //String hashPassword = getHashPassword(loginAdminDTOIn.getPassword());
        LoginMessageDTO loginMessageDTO=new LoginMessageDTO();
        MessageSender m=messageRepo.findByMessage(loginMessageDTO.getMessage());
        if(m!=null){
            loginMessageDTO.setSeemessage(true);
        }
        return loginMessageDTO;
    }*/
}
