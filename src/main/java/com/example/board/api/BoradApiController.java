package com.example.board.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoradApiController {

    @GetMapping("/api/hi")
    public String Hello () {
        return "Hello World";
    }
}
