package com.imooc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName: Test01
 * @Package: com.imooc.test
 * @Description:
 * @Date: 2021/12/17 11:02
 * @Author: sunzheng@beiming.com
 */
public class Test01 {

  public static void main(String[] args) {

    List<Map<String, Object>> list = new ArrayList<>();
    for (int i = 0; i < 5; ++i) {
      Map<String, Object> map = new HashMap<>();
      map.put("name", i);
      map.put("content", i + "AAA");
      list.add(map);
    }

    list.forEach(System.out::println);
    System.out.println("================================");

    List<Map<String, Object>> contentList = list.stream()
        .filter(x -> !x.get("content").toString().equals("")).collect(Collectors.toList());
    contentList.forEach(System.out ::println);


  }

}
