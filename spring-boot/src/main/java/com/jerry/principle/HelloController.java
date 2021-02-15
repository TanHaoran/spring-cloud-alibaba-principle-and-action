package com.jerry.principle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/14
 * Time: 15:40
 * Description:
 */
@RestController
public class HelloController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/hello")
    public String hello() {
        redisTemplate.opsForValue().set("key", "value");
        return "hello world";
    }

}
