package com.madlabtech.baseapp.service.customer;

import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.stereotype.Service;

/**
 * Created by Madhukara on 5/23/17.
 */
@Service
public class CustomerService extends GenericConversionService {

    public String login(String email, String password){

        String message = new String("Invalid Credentials");

        if(email.equals("mkekulandara@gmail.com")){
            if(password.equals("myApp")){
                message = "Login Success... :)";
            } else {
                message = "Wrong Password... :(";
            }
        }
        return message;
    }
}
