package com.neoflex.gateway.dto;

import com.neoflex.gateway.enumeration.ApplicationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
public class ApplicationStatusHistoryDTO {
    private Long id;
    private ApplicationStatus status;
    private LocalDateTime time;
}
