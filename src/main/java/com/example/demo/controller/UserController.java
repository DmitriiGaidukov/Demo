package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public User GetUser(@RequestParam(value = "firstname", defaultValue = "Boar") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Pig") String lastname,
                        @RequestParam(value = "age", defaultValue = "42") int age) {
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User GetUser(User user) {

        return user;
    }
}
