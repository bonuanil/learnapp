package com.learn.producer;

import com.learn.constant.ApplicationConstant;
import com.learn.dto.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produce")
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping("/message")
    public String sendMessage(@RequestBody Sample message) {

        try {
            kafkaTemplate.send(ApplicationConstant.TOPIC_NAME, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "json message sent succuessfully";
    }



}
