package com.mahesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.service.KafkaProducerService;



@RestController
public class KafkaController {
	@Autowired
    private KafkaProducerService producerService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        producerService.sendmessage("my-topic", message);
        return ResponseEntity.ok("Message sent to Kafka: " + message);
    }
}



