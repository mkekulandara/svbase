package com.madlabtech.baseapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Madhukara on 5/22/17.
 */
@Controller
public class GreetController {

    @RequestMapping("/")
    @ResponseBody
    public String greeting(){
        return "Hello, to the services";
    }

    @RequestMapping("/inside")
    @ResponseBody
    public String greetingInside(){
        return "You are now in the service backend of the BaseApp";
    }
}
