package com.docker.test.DockerTest.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("/test")
public class TestController
{

    @RequestMapping("/")
    public Map<String,Object> getValues()
    {
        Map<String,Object> data = new HashMap<>();

        data.put("message", "Java api is working fine");
        data.put("languages", Arrays.asList("Java", "Python", "Javascript"));
        data.put("code", 2345);

        return data;

    }
}
