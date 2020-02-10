package io.github.wanggit.antrpc.demo.api;

import io.github.wanggit.antrpc.commons.annotations.RpcMethod;

public interface RateLimitService {

    @RpcMethod(rateLimitEnable = true, limit = 10, durationInSeconds = 2)
    String upperIt(String content);

    String lowerIt(String content);

    String trim(String content);

}
