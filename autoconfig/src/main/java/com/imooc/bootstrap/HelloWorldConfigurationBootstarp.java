package com.imooc.bootstrap;

import com.imooc.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName: HelloWorldConfigurationBootstarp
 * @Package: com.imooc.bootstrap
 * @Description:
 * @Date: 2021/12/16 16:54
 * @Author: sunzheng@beiming.com
 */
@EnableHelloWorld
public class HelloWorldConfigurationBootstarp {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(
        HelloWorldConfigurationBootstarp.class)
        .web(WebApplicationType.NONE)
        .run(args);

    String helloWorld = context.getBean("helloWorld", String.class);

    System.out.println("helloWorld: bean->" + helloWorld);

    context.close();
  }

}
