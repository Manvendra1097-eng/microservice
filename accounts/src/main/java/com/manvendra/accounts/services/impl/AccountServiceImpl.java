package com.manvendra.accounts.services.impl;

import com.manvendra.accounts.constants.AccountsConstant;
import com.manvendra.accounts.dto.CustomerDto;
import com.manvendra.accounts.entity.Accounts;
import com.manvendra.accounts.entity.Customer;
import com.manvendra.accounts.exception.CustomerAlreadyExist;
import com.manvendra.accounts.repository.AccountsRepository;
import com.manvendra.accounts.repository.CustomerRepository;
import com.manvendra.accounts.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final ModelMapper mapper;
    private final CustomerRepository customerRepository;
    private final AccountsRepository accountsRepository;

    /**
     * @param customerDto
     */
    @Override
    public void createAccount(CustomerDto customerDto) {
        customerRepository.findByMobileNumber(customerDto.getMobileNumber()).orElseThrow(CustomerAlreadyExist::new);
        Customer customer = customerRepository.save(mapper.map(customerDto, Customer.class));
        Accounts accounts = getNewAccount(customer);
        accountsRepository.save(accounts);
    }

    /**
     * @param customer
     * @return
     */
    private Accounts getNewAccount(Customer customer) {
        long randomAccNo = 1000000000L + new Random().nextInt(900000000);
        return Accounts.builder().accountNumber(randomAccNo)
                .customerId(customer.getCustomerId())
                .accountType(AccountsConstant.SAVING.getValue())
                .branchAddress(AccountsConstant.ADDRESS.getValue())
                .build();
    }
}
