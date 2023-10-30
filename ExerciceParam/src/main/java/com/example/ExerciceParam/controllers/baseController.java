package com.example.ExerciceParam.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "/base")
public class baseController {

    @RequestMapping(value = "/params")
    public String paramsMethod(Model model) {
        List<String> params = List.of("paramètre 1", "paramètre 2", "paramètre 3");
        model.addAttribute("params", params);
        return "base";
    }
}
