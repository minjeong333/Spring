package com.example.day01Prac.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ex02Controller {

    final Ex02Service service;

    @Autowired
    public Ex02Controller(Ex02Service service) {
        this.service = service;
    }

    @GetMapping("/ex02")
    public String ex02(Model model){
        String[] result = service.getDan3();
        model.addAttribute("result", result);

        return "ex02View";
    }
}
