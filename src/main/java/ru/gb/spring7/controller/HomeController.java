package ru.gb.spring7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * GET запрос на localhost:8080/
     * доступен всем
     *
     * @return "home"
     */
    @GetMapping("/")
    public String forAll() {
        return "home";
    }

    /**
     * GET запрос на localhost:8080/public
     * доступен пользователям с ролью USER
     *
     * @return "public"
     */
    @GetMapping("/public")
    public String forAuthenticated() {
        return "public";
    }

    /**
     * GET запрос на localhost:8080/private
     * доступен пользователям с ролью ADMIN
     *
     * @return "private"
     */
    @GetMapping("/private")
    public String forAdmin() {
        return "private";
    }
}
