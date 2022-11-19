package com.neoflex.gateway.feign_client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.neoflex.gateway.dto.ApplicationDTO;
import com.neoflex.gateway.dto.FinishRegistrationRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "Deal", url = "http://localhost:8081/deal")
public interface DealMC {

    @PutMapping("/calculate/{applicationId}")
    public void calculate(@RequestBody FinishRegistrationRequestDTO finishRegistrationRequestDTO,
                          @PathVariable Long applicationId);

    @PostMapping("/document/{applicationId}/send")
    public void documentSend(@PathVariable Long applicationId) throws JsonProcessingException;

    @PostMapping("/document/{applicationId}/sign")
    public void documentSign(@PathVariable Long applicationId) throws JsonProcessingException;

    @PostMapping("/document/{applicationId}/code")
    public void documentCode(@PathVariable Long applicationId, @RequestBody Integer sesCode);

    @GetMapping("/admin/application/{applicationId}")
    public ApplicationDTO getApplicationById(@PathVariable Long applicationId);

    @GetMapping("/admin/application")
    public List<ApplicationDTO> getAllApplications();

}