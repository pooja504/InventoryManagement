//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//package com.pooju.api_gateway.routes;
//
//
//import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
//import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.function.*;
//
//@Configuration
//public class Route {
//
//    @Bean
//    public RouterFunction<ServerResponse> test() {
//        return RouterFunctions.route(RequestPredicates.GET("/ping"),
//                request -> ServerResponse.ok().body("pong from gateway"));
//    }
//
//
//
//    @Bean
//    public RouterFunction<ServerResponse> productService(){
//        return GatewayRouterFunctions.route("productService")
//                .route(RequestPredicates.path("api/product"), HandlerFunctions.http("http://localhost:8083/product/"))
//                .build();
//    }
//
//
//    @Bean
//
//    public RouterFunction<ServerResponse> inventory(){
//        return GatewayRouterFunctions.route("inventoryRoute").
//                route(RequestPredicates.path("api/inventory"),HandlerFunctions.http("http://localhost:8082/inventory/"))
//                .build();
//    }
//
//    @Bean
//
//    public RouterFunction<ServerResponse> order(){
//        return GatewayRouterFunctions.route("OrderRoute").
//                route(RequestPredicates.path("api/orders"),HandlerFunctions.http("http://localhost:8081/Orders/"))
//                .build();
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}