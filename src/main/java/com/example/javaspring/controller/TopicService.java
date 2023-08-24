package com.example.javaspring.controller;

import com.example.javaspring.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.javaspring.repo.TopicRepository;

import java.util.List;

@Service
public class TopicService {

    @Autowired
private TopicRepository topicRepository;



    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }





}





