package com.example.ExerciceParam.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/base")
public class baseController {

    @GetMapping("1-param")
    public String get1Param(Model model) {
        model.addAttribute("paramA", "John Dupont");
        return "1-param";
    }

    @GetMapping("2-params")
    public String get2Params(Model model) {
        model.addAttribute("paramA", "John Dupont");
        model.addAttribute("paramB", "Xavier Dupont");
        return "2-params";
    }

    @GetMapping("coll-params")
    public String getCollParams(Model model) {
        List<String> params = List.of("John Dupont", "Maria Martez", "Chloée Smith");
        model.addAttribute("params", params);
        return "base";
    }
}
