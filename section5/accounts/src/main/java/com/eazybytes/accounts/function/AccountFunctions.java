package com.eazybytes.accounts.function;

import com.eazybytes.accounts.service.IAccountsService;
import com.eazybytes.common.dto.MobileNumberUpdateDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class AccountFunctions {

    public Consumer<MobileNumberUpdateDto> updateAccountMobileNumber(IAccountsService iAccountsService) {
        return (mobileNumberUpdateDto) -> {
            System.out.println("updateAccountMobileNumber");
        };
    }
}
