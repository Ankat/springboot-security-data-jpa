package com.ankat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "resourceController")
public class ResourceController {

    @GetMapping(value = "/")
    public String defaultPage(){
        return "<h1>Hello World</h1>";
    }

    @GetMapping(value = "/admin")
    public String defaultAdminPage(){
        return "<h1>Hello World Admin</h1>";
    }

    @GetMapping(value = "/user")
    public String defaultUserPage(){
        return "<h1>Hello World User</h1>";
    }
}
