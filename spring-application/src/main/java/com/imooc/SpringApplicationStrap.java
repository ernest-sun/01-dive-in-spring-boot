package com.imooc;

import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName: SpringBootStrapt
 * @Package: com.imooc
 * @Description:
 * @Date: 2021/12/24 9:55
 * @Author: sunzheng@beiming.com
 */
@SpringBootApplication
public class SpringApplicationStrap {

  public static void main(String[] args) {
//    SpringApplication.run(SpringApplicationStrap.class, args);
    Set<String> set = new HashSet<>();
    set.add(SpringApplicationStrap.class.getName());
    SpringApplication application = new SpringApplication();
    application.setSources(set);
    ConfigurableApplicationContext context = application.run(args);

    ApplicationConfiguration configuration = context.getBean(ApplicationConfiguration.class);

    System.out.println(configuration);


  }

  @Component
  public static class ApplicationConfiguration {

  }

}
