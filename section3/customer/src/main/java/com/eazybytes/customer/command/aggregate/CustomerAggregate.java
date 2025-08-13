package com.eazybytes.customer.command.aggregate;

import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class CustomerAggregate {
    private String customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private boolean activeSw;
}
