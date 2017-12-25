package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/velas")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> authenticationRequest( ) {
        return ResponseEntity.ok(new String("poy od Velas"));
    }
}
