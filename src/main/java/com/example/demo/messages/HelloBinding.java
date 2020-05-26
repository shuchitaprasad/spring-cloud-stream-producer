package com.example.demo.messages;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface HelloBinding {
	/*the overall process of messages being passed 
	 * from a publisher to exchange to the queue is 
	 * done via a channel. So let's create a HelloBinding 
	 * interface that contains our MessageChannel called "greetingChannel"*/
	@Output("greetingChannel")
    MessageChannel greeting();

}
