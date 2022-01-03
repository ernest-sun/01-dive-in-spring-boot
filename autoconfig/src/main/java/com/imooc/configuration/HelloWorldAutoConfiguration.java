package com.imooc.configuration;

import com.imooc.annotation.EnableHelloWorld;
import com.imooc.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: HelloWorldAutoConfiguration
 * @Package: com.imooc.configuration
 * @Description:
 * @Date: 2021/12/22 13:47
 * @Author: sunzheng@beiming.com
 */
@Configuration      // Spring 模式注解装配
@EnableHelloWorld   // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "光影")  // 条件装配
public class HelloWorldAutoConfiguration {

}
