package io.github.wanggit.demo.direct_host_provider;

import io.github.wanggit.antrpc.boot.EnableAntRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAntRpc
public class DirectHostProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DirectHostProviderApplication.class, args);
    }

}
