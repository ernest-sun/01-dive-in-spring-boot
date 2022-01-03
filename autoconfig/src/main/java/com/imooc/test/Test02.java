package com.imooc.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: Test02
 * @Package: com.imooc.test
 * @Description:
 * @Date: 2021/12/22 16:56
 * @Author: sunzheng@beiming.com
 */
public class Test02 {

  public static void main(String[] args) {
    String str = "AAA100件";
    String numeric = getNumeric(str);
    System.out.println(numeric);

  }

  /**
   * 过滤非数字
   *
   * @param str
   * @return
   */
  public static String getNumeric(String str) {
    String regEx = "[^0-9]";
    Pattern p = Pattern.compile(regEx);
    Matcher m = p.matcher(str);
    return m.replaceAll("").trim();
  }

}
