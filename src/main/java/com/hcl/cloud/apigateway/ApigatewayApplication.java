package com.hcl.cloud.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author MohitKri
 *
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ApigatewayApplication {

    /**
     * .
     *
     * @param args
     *            the argument for main
     */
    public static void main(final String[] args) {
        SpringApplication.run(ApigatewayApplication.class, args);
    }

    /**
     *
     */
    public void pmd() {
    }

}
