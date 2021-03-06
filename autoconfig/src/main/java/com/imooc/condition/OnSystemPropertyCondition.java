package com.imooc.condition;


import java.util.Map;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName: OnSystemPropertyCondition
 * @Package: com.imooc.condition
 * @Description:
 * @Date: 2021/12/20 10:34
 * @Author: sunzheng@beiming.com
 */
public class OnSystemPropertyCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

    Map<String, Object> attributes = metadata.getAnnotationAttributes(
        ConditionalOnSystemProperty.class.getName());
    String propertyName = String.valueOf(attributes.get("name"));
    String propertyValue = String.valueOf(attributes.get("value"));

    String javaPropertyValue = System.getProperty(propertyName);

    return propertyValue.equals(javaPropertyValue);
  }
}
