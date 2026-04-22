package com.example.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//entity veri tabanındaki sütunların olduğu gibi taşınmasına deniyor. Veri tabanındaki
    // tablo birebir geçiyor. tablo yapısı yansıtılıyor.
    //


    @GetMapping("/hello")
    public String sayHello() {
        return "Merhaba, Spring Boot calisiyor!";
    }
}