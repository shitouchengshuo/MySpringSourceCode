package com.qiqi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * spring不扫描Controller
 * @Author:ZhaoQiqi
 * @create 2023/7/26 13:46
 */
@ComponentScan(value = "com.qiqi", excludeFilters =
		{@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
@Configuration
public class SpringConfig {
	// spring的 父容器
}
