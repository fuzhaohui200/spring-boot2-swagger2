package com.carlover.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "API - TEST", description = "TEST服务器")
public class TestController {

    @GetMapping("/api/v1/test")
    public String get() {
        return "hello test";
    }

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

}
