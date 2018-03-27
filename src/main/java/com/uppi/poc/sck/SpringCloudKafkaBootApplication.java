package com.uppi.poc.sck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
@SpringBootApplication
@EnableBinding(Sink.class)
@EnableAutoConfiguration
public class SpringCloudKafkaBootApplication {

	public static void main(String ...args) {
		SpringApplication.run(SpringCloudKafkaBootApplication.class,args);
	}
}
