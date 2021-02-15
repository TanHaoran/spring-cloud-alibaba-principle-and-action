package com.jerry.sampleprovider;

import com.jerry.sampleapi.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created with IntelliJ IDEA
 * User: Jerry
 * Date: 2021/2/15
 * Time: 17:08
 * Description:
 */
// failfast 表示当前服务的容错方式为快速失败，建议增删改操作使用。默认的方式是 failover，即失败自动切换，建议查询时使用这个。
// loadbalance 用来指定负载均衡的策略，默认的策略是 random。
@Service(cluster = "failfast", loadbalance = "roundrobin")
public class HelloServiceImpl implements IHelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]: Hello, %s", serviceName, name);
    }
}

