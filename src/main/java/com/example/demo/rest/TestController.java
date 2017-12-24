package com.example.demo.rest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    public String velasSitara(){
        return "Velas world!";
    }
}
