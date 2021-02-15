package com.jerry.principle.selector;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 15:54
 * Description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@AutoConfigurationPackage
@Import(GpImportSelector.class)
public @interface EnableAutoImport {
}
