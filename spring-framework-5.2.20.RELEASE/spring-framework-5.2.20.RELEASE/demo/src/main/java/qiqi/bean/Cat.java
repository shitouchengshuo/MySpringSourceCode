package qiqi.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component  implements InitializingBean
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Cat {

	private String name;

	public Cat() {
		System.out.println("******猫被创建了。。。。。。。。。。");
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//
//	}


	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}")
	public void setName(String name) {
		System.out.println("***********cat的 setName");
		this.name = name;
	}
}
