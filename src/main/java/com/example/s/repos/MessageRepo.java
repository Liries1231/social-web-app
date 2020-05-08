package com.example.s.repos;

import com.example.s.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface MessageRepo extends CrudRepository<Message,Long> {
    List<Message> findByTag(String tag);






}