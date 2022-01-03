package com.imooc.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName: AfterApplicationContextInitializer
 * @Package: com.imooc.context
 * @Description:
 * @Date: 2021/12/27 10:26
 * @Author: sunzheng@beiming.com
 */
public class AfterApplicationContextInitializer implements ApplicationContextInitializer {

  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {
    System.out.println("After application.id=" + applicationContext.getId());

  }
}
