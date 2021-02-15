package com.jerry.sampleconsumer;

import com.jerry.sampleapi.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/15
 * Time: 17:37
 * Description:
 */
@RestController
public class HelloController {

    @Reference(mock = "com.jerry.sampleconsumer.MockHelloService", cluster = "failfast")
    private IHelloService helloService;

    @GetMapping("/say")
    public String sayHello() {
        return helloService.sayHello("Jerry");
    }
}
