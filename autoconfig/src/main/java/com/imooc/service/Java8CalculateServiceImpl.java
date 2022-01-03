package com.imooc.service;

import java.util.stream.Stream;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @ClassName: Java8CalculateServiceImpl
 * @Package: com.imooc.service
 * @Description:
 * @Date: 2021/12/17 9:26
 * @Author: sunzheng@beiming.com
 */
@Profile("java8")
@Service
public class Java8CalculateServiceImpl implements CalculateService {

  @Override
  public Integer sum(Integer... values) {
    return Stream.of(values).reduce(0, Integer::sum);
  }

  public static void main(String[] args) {
    CalculateService calculateService = new Java8CalculateServiceImpl();
    Integer[] numarray = {1, 2, 3, 4, 5, 6, 7, 8};
    System.out.println(calculateService.sum(numarray));
  }
}
