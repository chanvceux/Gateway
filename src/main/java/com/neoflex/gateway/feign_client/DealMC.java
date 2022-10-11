package com.neoflex.gateway.feign_client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Deal", url = "http://localhost:8081/deal")
public class DealMC {
}
