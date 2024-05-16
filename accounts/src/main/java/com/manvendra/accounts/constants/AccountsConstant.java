package com.manvendra.accounts.constants;

import lombok.Getter;

@Getter
public enum AccountsConstant {

    SAVING("Saving"),
    ADDRESS("123 Main Street, New York"),
    STATUS_201("201"),
    MSG_201("Account created successfully"),
    STATUS_200("200"),
    MSG_200("Request processed successfully"),
    STATUS_500("500"),
    MSG_500("An error occur.Please try again or contact Dev team");
    private final String value;

    AccountsConstant(String value) {
        this.value = value;
    }

}
