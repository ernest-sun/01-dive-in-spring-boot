package com.imooc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: HelloWorldConfiguration
 * @Package: com.imooc.configuration
 * @Description:
 * @Date: 2021/12/16 16:46
 * @Author: sunzheng@beiming.com
 */
@Configuration
public class HelloWorldConfiguration {

  @Bean
  public String helloWorld() {
    return "hello, world";
  }

}
