package com.jerry.orderservice;

import com.jerry.userapi.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 22:04
 * Description:
 */
public class ConsumerMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:/META-INF/order-consumer.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        System.out.println(userService.getNameById("1"));
    }
}
