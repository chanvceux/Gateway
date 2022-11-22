package com.neoflex.gateway.feign_client;

import com.neoflex.gateway.dto.LoanApplicationRequestDTO;
import com.neoflex.gateway.dto.LoanOfferDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "Application", url = "${application.url}")
public interface ApplicationMC {

    @PostMapping("/application")
    List<LoanOfferDTO> offers(@RequestBody LoanApplicationRequestDTO loanApplicationRequestDTO);

    @PutMapping("/application/offer")
    void offerCalculation(@RequestBody LoanOfferDTO loanOfferDTO);
}
