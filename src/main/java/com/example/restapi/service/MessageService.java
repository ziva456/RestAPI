package com.example.restapi.service;

import com.example.restapi.dto.MessageDTO;
import com.example.restapi.entity.Message;
import com.example.restapi.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<MessageDTO> findAllMessages() {
        List<Message> messages = messageRepository.findAll();
        List<MessageDTO> messageDTOS = new ArrayList<>();
        for (Message message : messages){
            MessageDTO messageDTO = new MessageDTO();
//            messageDTO.setMessageId();
        }

        return messageDTOS;
    }
}
