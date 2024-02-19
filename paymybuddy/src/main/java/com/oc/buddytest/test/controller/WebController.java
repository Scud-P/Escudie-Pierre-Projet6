package com.oc.buddytest.test.controller;

import com.oc.buddytest.test.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    private static final Logger logger = LoggerFactory.getLogger(WebController.class);


    @GetMapping("/signup")
    public String getSignup() {
        System.out.println("Navigating to signup page");
        return "signup";
    }

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/connection")
    public String getConnection() {
        return "connection";
    }

    @GetMapping("/transfer")
    public String getTransfer() {
        return "transfer";
    }

    @GetMapping("/profile")
    public String getProfile() {
        return "profile";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "contact";
    }

    @GetMapping("/login")
    public String getLogin() {
        System.out.println("Navigating to login page");
        return "login";
    }

    @GetMapping("/modifyInfo")
    public String modifyInfo () {
        return "modifyinfo";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
