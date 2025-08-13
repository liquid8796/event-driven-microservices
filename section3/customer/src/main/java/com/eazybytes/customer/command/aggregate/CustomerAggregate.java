package com.eazybytes.customer.command.aggregate;

<<<<<<< HEAD
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class CustomerAggregate {
=======
import com.eazybytes.customer.command.CreateCustomerCommand;
import com.eazybytes.customer.command.event.CustomerCreatedEvent;
import com.eazybytes.customer.entity.Customer;
import com.eazybytes.customer.exception.CustomerAlreadyExistsException;
import com.eazybytes.customer.repository.CustomerRepository;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

@Aggregate
public class CustomerAggregate {
    @AggregateIdentifier
>>>>>>> 9f83fa804820bf87da737ce6e09c421a21b0fa2d
    private String customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private boolean activeSw;
<<<<<<< HEAD
=======

    public CustomerAggregate() {}

    @CommandHandler
    public CustomerAggregate(CreateCustomerCommand createCustomerCommand, CustomerRepository customerRepository) {
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumberAndActiveSw(createCustomerCommand.getMobileNumber(), true);
        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already registered with given mobileNumber "
                    + createCustomerCommand.getMobileNumber());
        }

        CustomerCreatedEvent customerCreatedEvent = new CustomerCreatedEvent();
        BeanUtils.copyProperties(createCustomerCommand, customerCreatedEvent);
        AggregateLifecycle.apply(customerCreatedEvent);
    }

    @EventSourcingHandler
    public void on(CustomerCreatedEvent customerCreatedEvent) {
        this.customerId = customerCreatedEvent.getCustomerId();
        this.name = customerCreatedEvent.getName();
        this.email= customerCreatedEvent.getEmail();
        this.mobileNumber = customerCreatedEvent.getMobileNumber();
        this.activeSw = customerCreatedEvent.isActiveSw();
    }
>>>>>>> 9f83fa804820bf87da737ce6e09c421a21b0fa2d
}
