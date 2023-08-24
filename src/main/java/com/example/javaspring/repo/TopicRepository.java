package com.example.javaspring.repo;

import com.example.javaspring.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    List<Topic> findByTitle(String topicTitle);
}