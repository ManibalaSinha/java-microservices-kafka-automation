package com.saas.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "event-topic", groupId = "saas-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
        // Add processing logic here
    }
}
