package com.manvendra.accounts.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class ErrorResponse {
    private String apiUrl;

    private HttpStatus errorCode;

    private LocalDateTime errorTime;

    private String errorMsg;
}
