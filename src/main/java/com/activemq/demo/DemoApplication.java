package com.activemq.demo;

import com.activemq.demo.model.InputMessage;
import com.activemq.demo.util.SplitMessage;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.ConnectionFactory;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception{

		CamelContext context = new DefaultCamelContext();

		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		SpringApplication.run(DemoApplication.class, args);

		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("jms:queue:inbound")
						.to("seda:end");
			}

		}
		);

		context.start();
		ConsumerTemplate consumerTemplate = context.createConsumerTemplate();
		String message = consumerTemplate.receiveBody("seda:end",String.class);
		System.out.println(message);

		SplitMessage splitMessage = new SplitMessage(message);
		System.out.println(splitMessage.inputMessage.getRequestType());
		System.out.println(splitMessage.inputMessage.getTrn());
		System.out.println(splitMessage.inputMessage.getName());
		System.out.println(splitMessage.inputMessage.getFormatType());
	//	System.out.println(splitMessage.inputMessage.getAmount());
		System.out.println(splitMessage.inputMessage.getCurrency());
		System.out.println(splitMessage.inputMessage.getService());
		System.out.println(splitMessage.inputMessage.getSourceCountryCode());
		System.out.println(splitMessage.validateAndPrepareMessage());



	}

}
