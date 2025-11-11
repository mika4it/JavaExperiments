package com.example.booleanapi.service;
import org.springframework.stereotype.Service;
import java.util.Random;
@service
public class BooleanService {
    public boolean getBoolean() {
        return new Random().nextBoolean();
    }
}