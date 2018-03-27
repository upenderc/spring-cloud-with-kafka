package com.uppi.poc.sck;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventListener {
private static final Logger LOG =Logger.getLogger(KafkaEventListener.class);
	@StreamListener(Sink.INPUT)
	public void onMessage(GenericMessage<?> message) {
		LOG.info(message.getPayload());
		LOG.info("Header "+message.getHeaders());
	}
}
