package com.neoflex.gateway.controller;

import com.neoflex.gateway.dto.LoanApplicationRequestDTO;
import com.neoflex.gateway.dto.LoanOfferDTO;
import com.neoflex.gateway.feign_client.ApplicationMC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gateway/applicationController/")
public class ApplicationController {

    private final ApplicationMC applicationMC;
    @Autowired
    public ApplicationController(ApplicationMC applicationMC) {
        this.applicationMC = applicationMC;
    }

    @PostMapping("/application")
    List<LoanOfferDTO> offers(@RequestBody LoanApplicationRequestDTO loanApplicationRequestDTO) {
     return applicationMC.offers(loanApplicationRequestDTO);
    }

    @PutMapping("/application/offer")
    public void offerCalculation(@RequestBody LoanOfferDTO loanOfferDTO) {
        applicationMC.offerCalculation(loanOfferDTO);
    }

}
