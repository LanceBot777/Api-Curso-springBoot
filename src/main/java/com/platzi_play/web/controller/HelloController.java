package com.platzi_play.web.controller;

import com.platzi_play.domain.service.PlatziPlayAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final PlatziPlayAiService AiService;
    private final String plataform;

    public HelloController(@Value("${spring.application.name}") String plataform, PlatziPlayAiService platziPlayAiService) {
        this.AiService = platziPlayAiService;
        this.plataform = plataform;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.AiService.generateGreeting( plataform );
    }
}
