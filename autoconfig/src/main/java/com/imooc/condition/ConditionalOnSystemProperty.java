package com.imooc.condition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Conditional;

/**
 * @ClassName: ConditionalOnSystemProperty
 * @Package: com.imooc.condition
 * @Description:
 * @Date: 2021/12/20 10:29
 * @Author: sunzheng@beiming.com
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

  String name() default "";

  String value() default "";


}
