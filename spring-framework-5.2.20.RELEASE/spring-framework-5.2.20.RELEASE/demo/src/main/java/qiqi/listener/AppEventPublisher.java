package qiqi.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AppEventPublisher  {

	@Autowired
	ApplicationEventPublisher applicationEventPublisher;

	public void publishEvent(Object event) {
		applicationEventPublisher.publishEvent(event);
	}
}
