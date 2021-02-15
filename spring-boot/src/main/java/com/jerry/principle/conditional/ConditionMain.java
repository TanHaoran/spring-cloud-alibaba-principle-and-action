package com.jerry.principle.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 16:16
 * Description:
 */
public class ConditionMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext((ConditionConfig.class));
        BeanClass beanClass = context.getBean(BeanClass.class);
        System.out.println(beanClass);
    }
}
