package io.github.wanggit.antrpc.demo.direct_host_consumer.web;

import io.github.wanggit.antrpc.commons.annotations.RpcAutowired;
import io.github.wanggit.antrpc.demo.api.DirectHostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("direct_host")
public class DirectHostController {

    @RpcAutowired
    private DirectHostService directHostService;

    @GetMapping("test")
    public String test(@RequestParam("content") String content){
        return directHostService.directHost(content);
    }

}
