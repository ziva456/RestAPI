package com.example.restapi.controller;

import com.example.restapi.dto.MessageDTO;
import com.example.restapi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/msgDto")
public class msgToDemonController {
    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<MessageDTO> getMessages() {
        return messageService.findAllMessages();
    }
}
