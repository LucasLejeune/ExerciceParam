package com.example.ExerciceParam.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/base")
public class baseRestController {

    @GetMapping("/params")
    public List<String> paramList() {
        return List.of("paramètre 1", "paramètre 2", "paramètre 3");
    }

    @GetMapping("/1-param")
    public String get1Param() {
        return "John Dupont";
    }

}
