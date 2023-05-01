package com.example.restapi.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Messages")
public class Message {
    @Id
    @Column(name = "message_id")
    private String messageId;

    @ManyToOne
    @JoinColumn(name = "conversation_id", referencedColumnName = "conversation_id")
    private Conversation conversation;

    @ManyToOne
    @JoinColumn(name = "sender_id", referencedColumnName = "user_id")
    private User sender;

    @Column(name = "message_text")
    private String messageText;

    @Column(name = "message_time")
    private LocalDateTime messageTime;


}
