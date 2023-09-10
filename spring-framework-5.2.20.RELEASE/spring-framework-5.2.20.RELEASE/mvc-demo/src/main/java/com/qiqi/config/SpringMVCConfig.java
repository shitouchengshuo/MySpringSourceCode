package com.qiqi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * springMVC只扫描controller
 * @Author:ZhaoQiqi
 * @create 2023/7/26 13:46
 */
@ComponentScan(value = "com.qiqi", includeFilters =
		{@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)}
		,useDefaultFilters = false)
@Configuration
public class SpringMVCConfig {
	// // springMVC 子容器，保有spring父容器，因此可以扫描到service等spring组件
}
