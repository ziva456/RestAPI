package com.example.restapi.repository;

import com.example.restapi.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  MessageRepository extends JpaRepository<Message, String>{
// additional methods, if needed
}
