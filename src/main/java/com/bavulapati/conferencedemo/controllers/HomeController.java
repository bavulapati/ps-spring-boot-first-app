package com.bavulapati.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(name = "/")
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    public Map getStatus() {
        Map status = new HashMap<String, String>();
        status.put("app-version", appVersion);
        return status;
    }
}
