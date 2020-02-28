package io.github.wanggit.antrpc.demo.telnet_provider.service;

import io.github.wanggit.antrpc.commons.annotations.RpcMethod;
import io.github.wanggit.antrpc.commons.annotations.RpcService;
import io.github.wanggit.antrpc.demo.telnet.api.TelnetService;

@RpcService
public class TelnetServiceImpl implements TelnetService {
    @Override
    @RpcMethod
    public void test() {
        System.out.println("Hello Test");
    }

    @Override
    @RpcMethod
    public void doHelp(String s) {
        System.out.println("Help me " + s);
    }
}
