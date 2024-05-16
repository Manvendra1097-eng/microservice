package com.manvendra.accounts.services;

import com.manvendra.accounts.dto.CustomerDto;

public interface AccountService {

    /**
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);
}
