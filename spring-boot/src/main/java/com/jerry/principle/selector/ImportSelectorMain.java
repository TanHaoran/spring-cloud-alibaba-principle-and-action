package com.jerry.principle.selector;

import org.redisson.api.RedissonClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 15:56
 * Description:
 */
@SpringBootApplication
@EnableAutoImport
public class ImportSelectorMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(ImportSelectorMain.class, args);
        FirstClass fc = ca.getBean(FirstClass.class);
        RedissonClient redissonClient = ca.getBean(RedissonClient.class);
        System.out.println(fc);
        System.out.println(redissonClient);
    }
}
