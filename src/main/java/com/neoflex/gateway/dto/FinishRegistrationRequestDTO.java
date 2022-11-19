package com.neoflex.gateway.dto;

import com.neoflex.gateway.enumeration.Gender;
import com.neoflex.gateway.enumeration.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
public class FinishRegistrationRequestDTO {
    Gender gender;
    MaritalStatus maritalStatus;
    Integer dependentAmount;
    LocalDate passportIssueDate;
    String passportIssueBranch;
    EmploymentDTO employment;
    String account;

}
