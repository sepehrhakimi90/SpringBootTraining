package org.fahsep.training.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${ucip.air.ip}")
    String airIP;

    @RequestMapping(value = "/")
    public String hello() {

        return "hello world" + airIP;
    }
}
