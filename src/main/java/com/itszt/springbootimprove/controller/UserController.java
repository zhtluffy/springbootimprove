package com.itszt.springbootimprove.controller;

import com.itszt.springbootimprove.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("haha")
    public String haha(){

        return iUserService.getUser().getUsername();
    }

}
