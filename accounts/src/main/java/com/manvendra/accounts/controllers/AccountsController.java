package com.manvendra.accounts.controllers;

import com.manvendra.accounts.constants.AccountsConstant;
import com.manvendra.accounts.dto.CustomerDto;
import com.manvendra.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountsController {

    @PostMapping
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        return ResponseEntity.status(HttpStatus.CREATED).body(ResponseDto.builder()
                .statusCode(AccountsConstant.STATUS_201.getValue())
                .statusMsg(AccountsConstant.MSG_201.getValue())
                .build());
    }
}
