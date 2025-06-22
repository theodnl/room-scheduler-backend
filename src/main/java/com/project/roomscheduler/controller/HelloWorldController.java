package com.project.roomscheduler.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Préfixe toutes les requêtes pour ce contrôleur par /api
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    @GetMapping("/message") // <--- Changez ceci de "/api/message" à "/message"
    public String getMessage() {
        return "Ceci est un message du backend Spring Boot !";
    }
}