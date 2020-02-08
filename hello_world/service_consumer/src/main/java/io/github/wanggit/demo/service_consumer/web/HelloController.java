package io.github.wanggit.demo.service_consumer.web;

import io.github.wanggit.antrpc.commons.annotations.RpcAutowired;
import io.github.wanggit.demo.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RpcAutowired
    private HelloService helloService;

    @GetMapping("say")
    public String sayHello(@RequestParam("name") String name){
        return helloService.sayHello(name);
    }

}
