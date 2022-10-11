package com.neoflex.gateway.feign_client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Application", url = "http://localhost:8082/application")
public class ApplicationMC {
}
