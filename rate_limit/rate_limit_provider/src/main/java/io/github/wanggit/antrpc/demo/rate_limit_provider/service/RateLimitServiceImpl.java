package io.github.wanggit.antrpc.demo.rate_limit_provider.service;

import io.github.wanggit.antrpc.commons.annotations.RpcMethod;
import io.github.wanggit.antrpc.commons.annotations.RpcService;
import io.github.wanggit.antrpc.demo.api.RateLimitService;

@RpcService
public class RateLimitServiceImpl implements RateLimitService {
    @Override
    public String upperIt(String s) {
        return null == s ? "" : s.toUpperCase();
    }

    @RpcMethod(rateLimitEnable = true, limit = 10, durationInSeconds = 2)
    @Override
    public String lowerIt(String s) {
        return null == s ? "" : s.toLowerCase();
    }

    @RpcMethod
    @Override
    public String trim(String s) {
        return null == s ? "" : s.trim();
    }
}
