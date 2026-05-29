package com.example.day01Prac.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex01Controller {

    final Ex01Service service;


    //@Autowired  생성자 주입은 @Autowired 생략가능
    public Ex01Controller(Ex01Service service) {
        this.service = service;
    }


    //화면
    @GetMapping("/ex01")
    public String ex01Form(){
        return "ex01Form";
    }

    @PostMapping("/ex01")
    public  String  ex01Calc(@RequestParam( name="su1" , defaultValue = "1", required = false) int su1                              ,
                             @RequestParam( name="su1" , defaultValue = "1", required = false) int su2,
                             Model model){

        int result = service.calc(su1, su2);
        model.addAttribute("data", result);
        return  "ex01Result";
    }
}
