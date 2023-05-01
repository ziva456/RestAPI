package com.example.restapi.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "Participants")
public class Participant {
    @Id
    private String participant_id;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation conversation;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
