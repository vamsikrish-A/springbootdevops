package com.devops.springbootdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @GetMapping("/health/check")
    public String healthCheck() {
        return "SpringBoot up and Running.";
    }

}
