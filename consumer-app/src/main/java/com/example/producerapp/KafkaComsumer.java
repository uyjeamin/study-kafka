package com.example.producerapp;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaComsumer {

    @KafkaListener(topics = "hello-topic", groupId = "my-group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("patition : " + record.partition() + ", offset : " + record.offset() + ", key : " + record.key() + ", value : " + record.value());
    }

}
