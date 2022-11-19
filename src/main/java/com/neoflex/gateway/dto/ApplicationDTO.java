package com.neoflex.gateway.dto;

import com.neoflex.gateway.enumeration.ApplicationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class ApplicationDTO {

    private Long id;
    private ClientDTO client;
    private CreditDTO credit;
    private ApplicationStatus applicationStatus;
    private LocalDate creationDate;
    private String appliedOffer;
    private LocalDate signDate;
    private String sesCode;
    private List<ApplicationStatusHistoryDTO> statusHistory;
}
