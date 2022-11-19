package com.neoflex.gateway.dto;

import com.neoflex.gateway.enumeration.Gender;
import com.neoflex.gateway.enumeration.MaritalStatus;
import lombok.*;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
public class ClientDTO {

    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthdate;
    private String email;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Integer dependentAmount;
    private PassportDTO passport;
    private EmploymentDTO employment;
    private String account;

}
