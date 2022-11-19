package com.neoflex.gateway.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.neoflex.gateway.dto.FinishRegistrationRequestDTO;
import com.neoflex.gateway.feign_client.DealMC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/dealController/")
public class DealController {

    private final DealMC dealMC;
    @Autowired
    public DealController(DealMC dealMC) {
        this.dealMC = dealMC;
    }

    @PutMapping("/calculate/{applicationId}")
    public void calculate(@RequestBody FinishRegistrationRequestDTO finishRegistrationRequestDTO,
                          @PathVariable Long applicationId) {
        dealMC.calculate(finishRegistrationRequestDTO, applicationId);
    }

    @PostMapping("/document/{applicationId}/send")
    public void documentSend(@PathVariable Long applicationId) throws JsonProcessingException {
        dealMC.documentSend(applicationId);
    }

    @PostMapping("/document/{applicationId}/sign")
    public void documentSign(@PathVariable Long applicationId) throws JsonProcessingException {
        dealMC.documentSign(applicationId);
    }

    @PostMapping("/document/{applicationId}/code")
    public void documentCode(@PathVariable Long applicationId, @RequestBody Integer sesCode) {
        dealMC.documentCode(applicationId, sesCode);
    }

}
