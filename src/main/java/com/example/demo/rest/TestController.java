package com.example.demo.rest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/velas")
public class TestController {

    @GetMapping
    @ResponseBody
    public String velasSitara(){
        return "Velas world!";
    }
}
