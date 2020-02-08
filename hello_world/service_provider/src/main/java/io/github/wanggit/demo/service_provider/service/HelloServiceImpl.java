package io.github.wanggit.demo.service_provider.service;

import io.github.wanggit.antrpc.commons.annotations.RpcMethod;
import io.github.wanggit.antrpc.commons.annotations.RpcService;
import io.github.wanggit.demo.api.HelloService;

@RpcService
public class HelloServiceImpl implements HelloService {

    @RpcMethod
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
