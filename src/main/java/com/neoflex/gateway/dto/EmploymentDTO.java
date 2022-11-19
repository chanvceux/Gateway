package com.neoflex.gateway.dto;

import com.neoflex.gateway.enumeration.EmploymentStatus;
import com.neoflex.gateway.enumeration.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmploymentDTO {
    EmploymentStatus employmentStatus;
    String employer;
    BigDecimal salary;
    Position position;
    Integer workExperienceTotal;
    Integer workExperienceCurrent;

}
