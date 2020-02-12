package io.github.wanggit.antrpc.demo.direct_host_consumer;

import io.github.wanggit.antrpc.boot.EnableAntRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAntRpc
public class DirectHostConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DirectHostConsumerApplication.class, args);
    }

}
