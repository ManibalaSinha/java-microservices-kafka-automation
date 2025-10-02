package com.saas.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.kafka.core.KafkaTemplate;

class KafkaProducerServiceTest {

    @Test
    void testSendMessage() {
        KafkaTemplate<String, String> kafkaTemplate = Mockito.mock(KafkaTemplate.class);
        KafkaProducerService producer = new KafkaProducerService(kafkaTemplate);
        producer.sendMessage("event-topic", "Hello Kafka!");
        Mockito.verify(kafkaTemplate).send("event-topic", "Hello Kafka!");
    }
}
