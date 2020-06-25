package ar.com.primary.eventbridge;

import ar.com.primary.ptp.jms.FSTMessageConverter;
import ar.com.primary.ptp.model.datacontainers.HasOrderHeader;
import ar.com.primary.ptp.model.matchingengine.OrderHeader;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.jms.support.converter.MessageConverter;

@SpringBootApplication
public class EventBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventBridgeApplication.class, args);
	}

	@Bean(name = "fstConverter")
	public MessageConverter getMessageConverter(){
		return new FSTMessageConverter();
	}



}
