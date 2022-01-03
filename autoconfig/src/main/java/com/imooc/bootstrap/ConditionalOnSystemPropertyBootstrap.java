package com.imooc.bootstrap;

import com.imooc.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: ConditionalOnSystemPropertyBootstrap
 * @Package: com.imooc.bootstrap
 * @Description:
 * @Date: 2021/12/20 11:01
 * @Author: sunzheng@beiming.com
 */
@ConditionalOnSystemProperty(name = "user.name", value = "光影")
public class ConditionalOnSystemPropertyBootstrap {

  @Bean
  @ConditionalOnSystemProperty(name = "user.name", value = "光影")
  public String helloWorld() {
    return "hello,光影";
  }

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(
        ConditionalOnSystemPropertyBootstrap.class)
        .web(WebApplicationType.NONE)
        .run(args);
    Object bean = context.getBean("helloWorld");
    System.out.println("名称是：" + bean);

    context.close();
  }

}
