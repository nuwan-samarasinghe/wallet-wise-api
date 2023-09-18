package com.demo.walletwiseapi.controllers;

import com.demo.walletwiseapi.dtos.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/user")
public interface UsersController {

    @PostMapping("/")
    ResponseEntity<UserDto> createUser();

    @PutMapping("/")
    ResponseEntity<UserDto> updateUser();

    @DeleteMapping("/{userId}")
    ResponseEntity<UserDto> deleteUserByUserId(@PathVariable String userId);

    @GetMapping("/{userId}")
    ResponseEntity<UserDto> getUserByUserId(@PathVariable String userId);

    @GetMapping("/{userName}")
    ResponseEntity<UserDto> getUserByUserName(@PathVariable String userName);

}
