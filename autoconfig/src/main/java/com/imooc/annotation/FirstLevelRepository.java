package com.imooc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: FirstLevelRepository
 * @Package: com.imooc.annotation
 * @Description:
 * @Date: 2021/12/16 13:34
 * @Author: sunzheng@beiming.com
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

  String value() default "";

}
