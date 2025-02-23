package com.example.CI.CD.Service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CiCdService {

    Random random = new Random();
    public int generateRandomNumber(){
        return random.nextInt(1000, 100000);
    }
}
