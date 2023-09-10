package com.qiqi;

import com.qiqi.config.SpringConfig;
import com.qiqi.config.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 最快速的整合注解版SpringMvc和Spring的方式
 */
public class QuickStarter extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override // 根容器的配置 (Spring的配置文件==Spring的配置类)
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{SpringConfig.class};
	}

	@Override // web容器的配置 (SpringMVC的配置文件==SpringMVC的配置类)
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{SpringMVCConfig.class};
	}

	@Override // servlet的映射 Dispatcheservlet的映射路径
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
