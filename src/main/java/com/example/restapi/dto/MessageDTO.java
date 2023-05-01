package com.example.restapi.dto;

import java.time.LocalDateTime;

public class MessageDTO {

    private String messageId;
    private String conversationId;
    private String senderId;
    private String messageText;
    private LocalDateTime messageTime;

    public MessageDTO() {
        this.messageId = messageId;
        this.conversationId = conversationId;
        this.senderId = senderId;
        this.messageText = messageText;
        this.messageTime = messageTime;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = String.valueOf(messageId);
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = String.valueOf(conversationId);
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = String.valueOf(senderId);
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public LocalDateTime getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(LocalDateTime messageTime) {
        this.messageTime = messageTime;
    }
}
