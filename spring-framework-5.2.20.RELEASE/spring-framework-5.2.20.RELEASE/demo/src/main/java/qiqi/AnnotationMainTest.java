package qiqi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import qiqi.bean.Cat;
import qiqi.bean.Hello;
import qiqi.config.MainConfig;
//import qiqi.listener.AppEventPublisher;
import qiqi.listener.AppEventPublisher;
import qiqi.listener.ChangeEvent;
import qiqi.listener.MessageEvent;

public class AnnotationMainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String definitionName : beanDefinitionNames) {
//			System.out.println(definitionName);77
//		}
//		Hello hello = applicationContext.getBean(Hello.class);
//		Cat cat = applicationContext.getBean(Cat.class);

		AppEventPublisher eventPublisher = applicationContext.getBean(AppEventPublisher.class);
		eventPublisher.publishEvent(new Cat());
		eventPublisher.publishEvent(new ChangeEvent(eventPublisher, "stop"));
		eventPublisher.publishEvent(new MessageEvent("好啊好啊"));
	}
}
