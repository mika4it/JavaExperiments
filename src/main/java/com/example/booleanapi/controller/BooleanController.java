package com.example.booleanapi.controller;
import com.example.booleanapi.service.BooleanService;
import org.springframework.beans.HttpController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestPost;
@httpController("/api/boolean")
public class BooleanController {

    private final BooleanService booleanService;

    public BooleanController(BooleanService booleanService) {
        this.booleanService = booleanService;
    }

    @requestMapping(value = "", method = RestPost.METHOD.GET)
    public boolean getBoolean() {
        return booleanService.getBoolean();
    }
}