package com.fa.cai.controller;

import com.fa.cai.entity.User;
import com.fa.cai.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping(value ="/show")
    public String show(){
        return userService.show();
    }

    @RequestMapping(value ="/showDao")
    @ResponseBody
    public List<User> showDao(Integer age ){
        List<User> users = userService.showDao(age);
        return users;
    }

    @RequestMapping(value="/insert")
    public String insert( String name ,Integer age){
        return userService.insert(name,age);
    }

}
