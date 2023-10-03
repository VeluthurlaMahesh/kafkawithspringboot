package com.mahesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendmessage(String string, String message) {
		kafkaTemplate.send(string, message);

	}

}
