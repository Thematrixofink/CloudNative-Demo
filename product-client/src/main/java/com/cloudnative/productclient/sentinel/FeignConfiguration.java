package com.cloudnative.productclient.sentinel;

import org.springframework.context.annotation.Bean;

public class FeignConfiguration {
    @Bean
    public ProductServiceFallback echoServiceFallback() {
        return new ProductServiceFallback();
    }
}
