package com.example.restapi.repository;

import com.example.restapi.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  MessageRepository extends JpaRepository<Message, Long>{
// additional methods, if needed
}
