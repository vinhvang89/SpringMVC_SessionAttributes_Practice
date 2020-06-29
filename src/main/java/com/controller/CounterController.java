package com.controller;

import com.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("myCounter")
public class CounterController {
    @ModelAttribute("myCounter")
    public MyCounter setCounter(){
        return new MyCounter();
    }

    @GetMapping("/")
    public String getCounter(@ModelAttribute("myCounter") MyCounter myCounter){
        myCounter.increment();
        return "index";
    }

}
