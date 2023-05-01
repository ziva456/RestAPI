package com.example.restapi.entity;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Conversations")
public class Conversation {
    @Id
    @Column(name = "conversation_id")
    private String conversationId;

    @Column(name = "name")
    private String name;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @OneToMany(mappedBy = "conversation")
    private List<Message> messages;

}
