package qiqi.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 工厂bean
 * 普通bean:
 * 区别：
 *   1.person=普通bean，注册的组件对象就是Person对象，类型是Person
 *   2.工厂bean=实现了FacrotyBean接口的组件，注册的不是HelloFactoryBean,而是HelloFactoryBean调用了
 *   getObject返回的对象，类型就是调用getObjectType返回的类型
 *
 *   Mybatis与spring整合就是通过SqlSessionFactoryBean，实际注册的是SqlSession
 */
@Component
public class HelloFactoryBean implements FactoryBean<Hello> {

	@Override
	public Hello getObject() throws Exception {
		return new Hello();
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}
