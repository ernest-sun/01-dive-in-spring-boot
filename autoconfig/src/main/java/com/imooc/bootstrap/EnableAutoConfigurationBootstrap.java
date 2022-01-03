package com.imooc.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName: EnableAutoConfigurationBootstrap
 * @Package: com.imooc.bootstrap
 * @Description:
 * @Date: 2021/12/22 13:44
 * @Author: sunzheng@beiming.com
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(
        EnableAutoConfigurationBootstrap.class)
        .web(WebApplicationType.NONE)
        .run(args);

    String helloWorld = context.getBean("helloWorld", String.class);

    System.out.println("bean= " + helloWorld);

    context.close();
  }

}
