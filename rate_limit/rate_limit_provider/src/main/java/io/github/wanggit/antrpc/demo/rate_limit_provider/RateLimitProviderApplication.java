package io.github.wanggit.antrpc.demo.rate_limit_provider;

import io.github.wanggit.antrpc.boot.EnableAntRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAntRpc
public class RateLimitProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RateLimitProviderApplication.class, args);
    }

}
