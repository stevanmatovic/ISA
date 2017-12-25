package com.example.demo.rest;


import com.example.demo.model.json.request.AuthenticationRequest;
import com.example.demo.model.json.response.AuthenticationResponse;
import com.example.demo.model.security.CerberusUser;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/velas")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> authenticationRequest( ) {

        return ResponseEntity.ok(new String("poy od Velas"));
    }
}
