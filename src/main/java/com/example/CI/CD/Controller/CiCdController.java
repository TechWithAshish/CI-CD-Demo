package com.example.CI.CD.Controller;


import com.example.CI.CD.Service.CiCdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CiCdController {

    @Autowired
    private CiCdService ciCdService;

    @GetMapping("/random-number")
    public ResponseEntity<String> generateRandomNumber(){
        int number = ciCdService.generateRandomNumber();
        String str = "Random Number generated for you is :- "+number;

        return new ResponseEntity<>(str, HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity<String> getInfo(){
        return new ResponseEntity<>("We are generating random number from 1000 to 100000", HttpStatus.OK);
    }
}
