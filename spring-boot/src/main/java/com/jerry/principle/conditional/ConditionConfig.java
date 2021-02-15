package com.jerry.principle.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 16:14
 * Description:
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(GpCondition.class)
    public BeanClass beanClass() {
        return new BeanClass();
    }
}
