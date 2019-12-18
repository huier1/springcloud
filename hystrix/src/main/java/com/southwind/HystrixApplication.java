package com.southwind;
/**
 * `@EnableCircuitBreaker`：声明启用数据监控
 *
 * `@EnableHystrixDashboard`：声明启用可视化数据监控
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
//@EnableHystrixDashboard仪表盘用来格式化数据监控的
//@EnableCircuitBreaker`：声明启用数据监控
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
    }
}