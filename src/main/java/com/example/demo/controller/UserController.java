package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getUser(@PathVariable("id") Long id) {
        return userRepository.findById(id);
    }
    @GetMapping("/")
	public String test() {
		return "유열바보";
	}

}