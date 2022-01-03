package com.imooc.bootstrap;

import com.imooc.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName: CalculateServiceBootstarp
 * @Package: com.imooc.bootstrap
 * @Description:
 * @Date: 2021/12/17 10:46
 * @Author: sunzheng@beiming.com
 */
@SpringBootApplication(scanBasePackages = {"com.imooc.service"})
public class CalculateServiceBootstrap {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(
        CalculateServiceBootstrap.class)
        .web(WebApplicationType.NONE)
        .profiles("java8")
        .run(args);

    CalculateService calculateService = context.getBean(CalculateService.class);

    System.out.println(
        "calculateService.sun(1,2...10)=" + calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    context.close();
  }

}
