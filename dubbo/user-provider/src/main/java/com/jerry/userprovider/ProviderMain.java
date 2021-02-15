package com.jerry.userprovider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 21:56
 * Description:
 */
public class ProviderMain {

    public static void main(String[] args) throws IOException {
        // 第一种方式
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:/META-INF/user-provider.xml");
        context.start();
        // 阻塞 main 线程
        System.in.read();

        // 第二种方式
//         Main.main(args);
    }
}
