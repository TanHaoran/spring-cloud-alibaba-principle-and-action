package com.jerry.sampleprovider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/15
 * Time: 17:13
 * Description:
 */
@DubboComponentScan
@SpringBootApplication
public class SpringCloudDubboSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboSampleProviderApplication.class, args);
    }
}
