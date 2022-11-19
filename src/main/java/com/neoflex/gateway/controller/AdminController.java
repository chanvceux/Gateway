package com.neoflex.gateway.controller;

import com.neoflex.gateway.dto.ApplicationDTO;
import com.neoflex.gateway.feign_client.DealMC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gateway/adminController/")
public class AdminController {

    private final DealMC dealMC;

    @Autowired
    public AdminController(DealMC dealMC) {
        this.dealMC = dealMC;
    }

    @GetMapping("/admin/application/{applicationId}")
    public ApplicationDTO getApplicationById(@PathVariable Long applicationId) {
        return dealMC.getApplicationById(applicationId);
    }

    @GetMapping("/admin/application")
    public List<ApplicationDTO> getAllApplications() {
        return dealMC.getAllApplications();
    }

}
