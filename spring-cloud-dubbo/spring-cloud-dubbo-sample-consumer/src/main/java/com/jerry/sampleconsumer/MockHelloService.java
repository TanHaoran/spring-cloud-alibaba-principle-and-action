package com.jerry.sampleconsumer;

import com.jerry.sampleapi.IHelloService;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/15
 * Time: 20:53
 * Description:
 */
public class MockHelloService implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Sorry, server cannot be visited now, I'll give you ...";
    }
}
