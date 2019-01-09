package com.kafka.springbootkafkaproducerexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.springbootkafkaproducerexample.model.User;

/**
 * @author Saubhagya.Pradhan2
 * Controller class for publishing message
 */
@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example1";

    @GetMapping("/publish/{name}")
    public String sendMessage(@PathVariable("name") final String name) {

       // kafkaTemplate.send(TOPIC, new User(name, "Technology", 12000L));
        kafkaTemplate.send(TOPIC, 0, null, new User(name, "Technology", 12000L));

        return "Published successfully";
    }
}
