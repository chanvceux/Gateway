package com.neoflex.gateway.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.ui.context.Theme;

@Builder
@Data
@AllArgsConstructor
public class EmailMessageDTO {

    String address;
    Theme theme;
    Long applicationID;

}
