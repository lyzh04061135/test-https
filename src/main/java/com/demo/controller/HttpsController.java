package com.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class HttpsController {
    @RequestMapping(path = "/test")
    public Map<String, Object> test() {
        log.debug("test");
        Map<String, Object>map=new HashMap<>();
        map.put("msg", "test");
        return map;
    }

    @RequestMapping(path = "/testHttp")
    public Map<String, Object> testHttp() {
        log.debug("testHttp");
        Map<String, Object>map=new HashMap<>();
        map.put("msg", "testHttp");
        return map;
    }
}
