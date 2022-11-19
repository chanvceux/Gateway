package com.neoflex.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionalServicesDTO {
    private Long id;
    private Boolean isInsuranceEnabled;
    private Boolean isSalaryClient;
}
