package com.madlabtech.baseapp.controller.customer;

import com.madlabtech.baseapp.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Madhukara on 5/23/17.
 */
@RestController
@RequestMapping(value = "Customer", consumes = "application/json", produces = "application/json")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<CustomerResponse> login (final @RequestBody CustomerRequest customerRequest){

        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setMessage(customerService.login(customerRequest.getEmail(), customerRequest.getPassword()));
        return new ResponseEntity<CustomerResponse>(customerResponse, HttpStatus.OK);
    }
}
