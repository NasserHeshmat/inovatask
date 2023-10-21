package com.system.inova.controller;

import com.system.inova.entity.Story;
import com.system.inova.entity.User;
import com.system.inova.service.framework.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;



    @PostMapping("/addPost")
    public ResponseEntity<String> addPost(@RequestParam Long userId, @RequestBody Story story) {

        userService.addPost(story,userId);



        String response = "Received data: " + story;


        return ResponseEntity.ok(response);
    }

    @PostMapping("/addUser")
    public ResponseEntity<String> addPost( @RequestBody User user) {

        userService.addUser(user);



        String response = "Received data: " + user;


        return ResponseEntity.ok(response);
    }
}
