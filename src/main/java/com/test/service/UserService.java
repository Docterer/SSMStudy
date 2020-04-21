package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void getUser(){
        System.out.println("service层");
    }
}
