package com.example.restapi.controller;

import com.example.restapi.dto.MessageDTO;

import com.example.restapi.entity.User;
import com.example.restapi.repository.MessageRepository;
import com.example.restapi.service.MessageService;
import com.example.restapi.service.UserService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/msgDto")
public class msgToDemonController {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final MessageRepository messageRepository;
    @Autowired
    public msgToDemonController(KafkaTemplate<String, String> kafkaTemplate, MessageRepository messageRepository) {
        this.kafkaTemplate = kafkaTemplate;
        this.messageRepository = messageRepository;
    }
    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public List<MessageDTO> getMessages() {return messageService.findAllMessages();}

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestBody MessageDTO messageDTO) {
        log.info("messageDTO : {}",messageDTO);
        Gson gson = new Gson();
        // Save message to database
//        messageRepository.save(message);

        // Send message to Kafka topic
        kafkaTemplate.send("rest-server", messageDTO.getMessageText());
        String responseBody = "This is the response body";
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Custom-Header", "custom-value");
        return ResponseEntity
                .status(HttpStatus.OK)
                .headers(responseHeaders)
                .body(responseBody);
    }

}
