package com.example.restapi.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDTO {

    private String messageId;
    private String conversationId;
    private String senderId;
    private String messageText;
    private LocalDateTime messageTime;

}
