package com.bidding.apiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	/*
	 * @Bean public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
	 * return builder.routes() .route("service1_route", r -> r.path("/service1/**")
	 * .uri("http://localhost:8081")) // Replace with your service1 URL
	 * .route("service2_route", r -> r.path("/service2/**") .filters(f ->
	 * f.stripPrefix(1)) // Strips `/service2` from the path
	 * .uri("http://localhost:8082")) // Replace with your service2 URL
	 * .route("service_with_predicates", r -> r.path("/service3/**")
	 * .and().method("GET") .uri("http://localhost:8083")) // Replace with your
	 * service3 URL .build(); }
	 */
	

}
