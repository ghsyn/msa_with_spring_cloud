//package com.example.apigatewayservice.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//
//@Configuration
//public class FilterConfig {
//
//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/first/**")
//                        .filters(f -> f.addRequestHeader("first-service-req", "first-service-req-header")
//                                .addResponseHeader("first-service-res", "first-service-res-header"))
//                        .uri("http://127.0.0.1:8081"))
//                .route(r -> r.path("/second/**")
//                        .filters(f -> f.addRequestHeader("second-service-req", "second-service-req-header")
//                                .addResponseHeader("second-service-res", "second-service-res-header"))
//                        .uri("http://127.0.0.1:8082"))
//                .build();
//    }
//}
