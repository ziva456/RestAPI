package com.example.restapi.dto;
import com.example.restapi.entity.Message;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

public class ConversationDTO {

    private String conversationId;
    private String name;
    private LocalDateTime dateCreated;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

}
