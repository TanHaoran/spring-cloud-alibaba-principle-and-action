package com.jerry.sampleconsumer;

import com.jerry.sampleapi.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 22:33
 * Description:
 */
@SpringBootApplication
public class ConsumerApplication {

    @Reference(url = "dubbo://192.168.1.228:20880/com.jerry.sampleapi.IHelloService")
    private IHelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> System.out.println(helloService.sayHello("Jerry"));
    }

}
