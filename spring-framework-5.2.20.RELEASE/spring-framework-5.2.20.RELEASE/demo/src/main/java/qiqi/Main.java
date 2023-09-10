package qiqi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qiqi.bean.Cat;
import qiqi.bean.Person;
import qiqi.config.MainConfig;

public class Main {

	public static void main(String[] args) {
//		// 解析spring的配置文件
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
//		System.out.println(cat);
		Cat person = applicationContext.getBean(Cat.class);
		System.out.println(person);
		// 获取配置文件的 <bean id="helloService" .... />
//		HelloService helloService = (HelloService)applicationContext.getBean("helloService");
		// 调用方法
//		helloService.sayHello("China");
	}
// 封装了当前bean的所有属性名和值，可以由后置处理器处理得到
}
