package qiqi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import qiqi.bean.Cat;
import qiqi.bean.Person;

//@Import({Person.class, MainConfig.MyImportRegister.class})
@Configuration
@ComponentScan("qiqi")
public class MainConfig {

// static class MyImportRegister implements ImportBeanDefinitionRegistrar{
//
//	 @Override
//	 public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
//										 BeanDefinitionRegistry registry) {
//		 RootBeanDefinition catDefinition = new RootBeanDefinition();
//		 catDefinition.setBeanClass(Cat.class);
//		 registry.registerBeanDefinition("tomcat", catDefinition);
//	 }
// }


	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
}
