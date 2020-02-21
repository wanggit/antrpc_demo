package io.github.wanggit.antrpc.demo.log_report_kafka_service_2.service;

import io.github.wanggit.antrpc.commons.annotations.LinkMonitor;
import io.github.wanggit.antrpc.commons.annotations.RpcAutowired;
import io.github.wanggit.antrpc.commons.annotations.RpcMethod;
import io.github.wanggit.antrpc.commons.annotations.RpcService;
import io.github.wanggit.antrpc.demo.api.HelloService;
import io.github.wanggit.antrpc.demo.api.LogReportService;

@RpcService
public class HelloServiceImpl implements HelloService {

    @RpcAutowired
    private LogReportService logReportService;

    @Override
    @RpcMethod
    @LinkMonitor
    public String sayHello(String s) {
        boolean isLower = false;
        if (logReportService.isLowerCase(s)){
            s = s.toUpperCase();
            isLower = true;
        }
        if (logReportService.isUpperCase(s)){
            s = s.toLowerCase();
            isLower = false;
        }
        logReportService.report("The result is" + isLower);
        return "Hello " + s;
    }
}
