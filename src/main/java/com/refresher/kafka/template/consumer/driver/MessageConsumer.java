package com.refresher.kafka.template.consumer.driver;

import com.refresher.kafka.template.model.CustomMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Event Consumer Class
 */
@Slf4j
@Component
public class MessageConsumer {

    private static final String TOPIC_NAME = "kafka";

    /**
     * KafkaListener based Consumer
     * @param message
     */
    @KafkaListener(topics = TOPIC_NAME, groupId = "kafka_topic_grp_1")
    public void receiveMessage(CustomMessage message) {
        log.info("Listened Message:" + message);
    }

}
