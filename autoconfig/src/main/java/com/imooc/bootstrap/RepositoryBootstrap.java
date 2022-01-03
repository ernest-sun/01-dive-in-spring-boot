package com.imooc.bootstrap;

import com.imooc.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: RepoistoryBootstrap
 * @Package: com.imooc.bootstrap
 * @Description:
 * @Date: 2021/12/16 13:58
 * @Author: sunzheng@beiming.com
 */
@ComponentScan(value = "com.imooc.repository")
public class RepositoryBootstrap {

  public static void main(String[] args) {

    ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
        .web(WebApplicationType.NONE)
        .run(args);
    MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository",
        MyFirstLevelRepository.class);

    System.out.println("MyFirstLevelRepository:" + myFirstLevelRepository);

    context.close();

  }

}
