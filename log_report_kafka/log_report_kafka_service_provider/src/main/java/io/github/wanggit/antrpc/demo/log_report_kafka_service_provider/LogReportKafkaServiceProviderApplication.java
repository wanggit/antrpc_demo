package io.github.wanggit.antrpc.demo.log_report_kafka_service_provider;

import io.github.wanggit.antrpc.boot.EnableAntRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAntRpc
public class LogReportKafkaServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogReportKafkaServiceProviderApplication.class, args);
    }

}
