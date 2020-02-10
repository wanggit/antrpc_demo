package io.github.wanggit.antrpc.demo.rate_limit_consumer.web;

import io.github.wanggit.antrpc.commons.annotations.RpcAutowired;
import io.github.wanggit.antrpc.demo.api.RateLimitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rate_limit")
public class RateLimitController {

    @RpcAutowired
    private RateLimitService rateLimitService;

    @GetMapping("upper")
    public String upper(@RequestParam String content){
        return rateLimitService.upperIt(content);
    }

    @GetMapping("lower")
    public String lower(@RequestParam String content){
        return rateLimitService.lowerIt(content);
    }

    @GetMapping("trim")
    public String trim(@RequestParam String content){
        return rateLimitService.trim(content);
    }

}
