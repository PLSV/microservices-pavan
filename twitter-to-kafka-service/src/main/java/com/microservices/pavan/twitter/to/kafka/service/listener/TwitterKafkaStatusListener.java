package com.microservices.pavan.twitter.to.kafka.service.listener;

import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.StatusAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class TwitterKafkaStatusListener extends StatusAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterKafkaStatusListener.class);

    @Override
    public void onStatus(Status status) {
        LOG.info("Twitter status with text {}", status.getText());
    }
}
