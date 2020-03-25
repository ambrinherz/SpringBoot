package com.ambrin.underwater.controller;

import com.ambrin.underwater.model.UnderwaterRequest;
import com.ambrin.underwater.model.UnderwaterResponse;
import com.ambrin.underwater.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    private SecurityService securityservice;

    @Autowired
    public SecurityController(SecurityService securityservice) {
        this.securityservice = securityservice;
    }

    @PostMapping("/security")
    public ResponseEntity<?> getSalinity(@RequestBody UnderwaterRequest request) {
        UnderwaterResponse response = securityservice.findSalinity(request);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
