package com.huawei.facedetect.test.controller;

import org.springframework.stereotype.Component;


@Component
public class HellowordproviderDelegate {

    public String helloworld(String name){

        return "Welcome,"+name;
    }
}
