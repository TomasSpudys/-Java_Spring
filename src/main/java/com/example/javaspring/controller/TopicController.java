package com.example.javaspring.controller;

import com.example.javaspring.entity.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Topics")
public class TopicController {

    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }



    @GetMapping
    public String getTopics(Model model) {
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("topics", topics);
        return "topics";
    }


    }








