package ru.yandex.practicum.catsgram.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SimpleController {

    private static final Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @GetMapping("/home")
    public String homePage() {
        logger.info("Получен запрос");
        return "Котограм";
    }
}