package com.kafka.springbootkafkaconsumerexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import com.kafka.springbootkafkaconsumerexample.model.User;

/**
 * @author Saubhagya.Pradhan2
 * This is the listener class for consuming the messages from producer
 */
@Service
public class KafkaConsumer {

    //@KafkaListener(topics = "Kafka_Example1", group = "group_id")
    @KafkaListener(topicPartitions = @TopicPartition(topic = "Kafka_Example1", partitions = { "0"}), group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
