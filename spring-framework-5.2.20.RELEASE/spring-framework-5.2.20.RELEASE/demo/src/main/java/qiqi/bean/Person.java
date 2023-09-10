package qiqi.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * Aware接口：帮我们装配spring底层的一些组件
 */
//@Component implements InitializingBean
//@Component
public class Person  implements ApplicationContextAware, MessageSourceAware {

	private String name;

	private ApplicationContext applicationContext;
	private MessageSource messageSource;

	private Cat cat;

	public Person() {
		System.out.println("******人被创建了。。。。。。。。。。");
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//
//	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// 回调注入
		this.applicationContext = applicationContext;
	}
	// AbstractAutowireCapableBeanFactory(或者其他增强器).applyBeanPostProcessorsBeforeInitialization
	//中的org.springframework.context.support.ApplicationContextAwareProcessor.invokeAwareInterfaces进行调用的
	@Override
	public void setMessageSource(MessageSource messageSource) {
		// 回调注入
		this.messageSource = messageSource;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setCat(Cat cat) {
		this.cat = cat;
	}
}
