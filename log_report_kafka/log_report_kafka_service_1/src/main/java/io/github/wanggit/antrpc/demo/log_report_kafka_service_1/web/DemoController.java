package io.github.wanggit.antrpc.demo.log_report_kafka_service_1.web;

import io.github.wanggit.antrpc.commons.annotations.RpcAutowired;
import io.github.wanggit.antrpc.demo.api.HelloService;
import io.github.wanggit.antrpc.demo.api.LogReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RpcAutowired
    private HelloService helloService;

    @RpcAutowired
    private LogReportService logReportService;

    @GetMapping("sayHello")
    public String sayHello(@RequestParam String name){
        return helloService.sayHello(name);
    }

    @GetMapping("report")
    public String report(@RequestParam String content){
        return logReportService.report(content);
    }

}
