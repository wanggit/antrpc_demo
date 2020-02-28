package io.github.wanggit.antrpc.demo.telnet_consumer.web;

import io.github.wanggit.antrpc.commons.annotations.RpcAutowired;
import io.github.wanggit.antrpc.demo.telnet.api.HelloService;
import io.github.wanggit.antrpc.demo.telnet.api.TelnetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelnetConsumerDemo {

    @RpcAutowired
    private HelloService helloService;

    @RpcAutowired
    private TelnetService telnetService;

    @GetMapping("doTest")
    public String doTest(){
        helloService.sayHello("wanggang");
        helloService.sayBay("wanggang");
        telnetService.doHelp("wanggang");
        telnetService.test();
        return null;
    }

}
