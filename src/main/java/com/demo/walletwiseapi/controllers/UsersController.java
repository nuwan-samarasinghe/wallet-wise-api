package com.demo.walletwiseapi.controllers;

import com.demo.walletwiseapi.dtos.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
public interface UsersController {

    @Operation(summary = "Create User", description = "create the user with the given details")
    @PostMapping("/")
    ResponseEntity<UserDto> createUser(UserDto userDto);

    @Operation(summary = "Update User", description = "update the user with the given details")
    @PutMapping("/")
    ResponseEntity<UserDto> updateUser(UserDto userDto);

    @Operation(summary = "Delete User", description = "delete the user with given user id")
    @DeleteMapping("/{userId}")
    ResponseEntity<UserDto> deleteUserByUserId(@PathVariable String userId);

    @Operation(summary = "Get User", description = "get the user with the given user id")
    @GetMapping("/{userId}")
    ResponseEntity<UserDto> getUserByUserId(@PathVariable String userId);

    @Operation(summary = "Get User", description = "get user details for the given username")
    @GetMapping("/{userName}")
    ResponseEntity<UserDto> getUserByUserName(@PathVariable String userName);

}
