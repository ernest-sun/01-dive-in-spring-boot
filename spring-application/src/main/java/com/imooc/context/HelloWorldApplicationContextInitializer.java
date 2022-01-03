package com.imooc.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @ClassName: HelloWorldApplicationContextInitializer
 * @Package: com.imooc.context
 * @Description:
 * @Date: 2021/12/27 10:21
 * @Author: sunzheng@beiming.com
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {

  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {

    System.out.println("ConfigurableApplicationContext.id=" + applicationContext.getId());

  }
}
