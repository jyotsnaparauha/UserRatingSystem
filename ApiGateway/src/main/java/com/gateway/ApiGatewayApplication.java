package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	/*
	 * @Bean public RouteLocator myRoutes(RouteLocatorBuilder builder) { return
	 * builder.routes() .route("USER-SERVICE", r ->
	 * r.path("/users/**").uri("http://localhost:8081")) .build(); }
	 */
	 
	/*
	 * @Bean public DiscoveryClientRouteDefinitionLocator
	 * discoveryClientRouteLocator(DiscoveryClient discoveryClient) {
	 * 
	 * return new DiscoveryClientRouteDefinitionLocator(discoveryClient); }
	 */
}
