package io.github.wanggit.antrpc.demo.log_report_kafka_service_provider.service;

import io.github.wanggit.antrpc.commons.annotations.RpcMethod;
import io.github.wanggit.antrpc.commons.annotations.RpcService;
import io.github.wanggit.antrpc.demo.api.LogReportService;

@RpcService
public class ReportServiceImpl implements LogReportService {
    @Override
    @RpcMethod
    public String report(String s) {
        return "report to " + s;
    }

    @Override
    @RpcMethod
    public Boolean isUpperCase(String s) {
        return null != s && s.toUpperCase().equals(s);
    }

    @Override
    @RpcMethod
    public Boolean isLowerCase(String s) {
        return null != s && s.toLowerCase().equals(s);
    }
}
