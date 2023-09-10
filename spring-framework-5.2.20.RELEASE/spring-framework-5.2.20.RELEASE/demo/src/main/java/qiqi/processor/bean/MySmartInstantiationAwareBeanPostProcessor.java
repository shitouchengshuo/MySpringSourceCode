package qiqi.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 *  bean组件的PostProcessor -- 子
 *  bean进行代理增强间使用
 */
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	public MySmartInstantiationAwareBeanPostProcessor() {
		System.out.println("*****MySmartInstantiationAwareBeanPostProcessor...");
	}

	// 预测bean类型,最后一次改变组件类型
	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor....predictBeanType");
		return null;
	}

	// 返回我们要使用的构造器候选列表
	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor....determineCandidateConstructors");
		// 可以在这里自己返回一个构造器
		return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
	}

    //返回早起的bean引用  定义三级缓存中的bean信息
	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
	}
}
