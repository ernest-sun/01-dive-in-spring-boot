package com.imooc.annotation;

import com.imooc.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: HelloWorldImportSelector
 * @Package: com.imooc.annotation
 * @Description:
 * @Date: 2021/12/16 17:09
 * @Author: sunzheng@beiming.com
 */
public class HelloWorldImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    return new String[]{HelloWorldConfiguration.class.getName()};
  }
}
