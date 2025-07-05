package com.example.producerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafakaProducerExample implements CommandLineRunner {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafakaProducerExample(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        kafkaTemplate.send("hello-topic","1","가");
        kafkaTemplate.send("hello-topic","1","나");
        kafkaTemplate.send("hello-topic","1","다");
        kafkaTemplate.send("hello-topic","1","라");
        System.out.println("send!");
    }
}
