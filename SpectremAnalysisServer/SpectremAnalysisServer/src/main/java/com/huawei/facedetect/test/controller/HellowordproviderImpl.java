package com.huawei.facedetect.test.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-26T10:25:30.746+08:00")

@RestSchema(schemaId = "hellowordprovider")
@RequestMapping(path = "/hellowordprovider", produces = MediaType.APPLICATION_JSON)
public class HellowordproviderImpl {

    @Autowired
    private HellowordproviderDelegate userHellowordproviderDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHellowordproviderDelegate.helloworld(name);
    }

}
