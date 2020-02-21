package com.trifulca.OnePieceDB.controller;

import javafx.application.Application;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.QueryParameter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping(value = "/test/{word}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String testEndpoint(@PathVariable("word") String returnWord){
        return "You sent the following word: " + returnWord;
    }
}
