package com.neoflex.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
public class PassportDTO {

    private Long id;
    private String series;
    private String number;
    private LocalDate issueDate;
    private String issueBranch;
}
