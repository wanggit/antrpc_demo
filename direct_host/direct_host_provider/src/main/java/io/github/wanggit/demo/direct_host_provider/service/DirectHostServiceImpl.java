package io.github.wanggit.demo.direct_host_provider.service;

import io.github.wanggit.antrpc.commons.annotations.RpcMethod;
import io.github.wanggit.antrpc.commons.annotations.RpcService;
import io.github.wanggit.antrpc.demo.api.DirectHostService;

@RpcService
public class DirectHostServiceImpl implements DirectHostService {

    @RpcMethod
    @Override
    public String directHost(String param) {
        System.out.println("Run........");
        return "Direct Host " + param;
    }
}
