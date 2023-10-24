package com.demo.walletwiseapi.controllers.impl;

import com.demo.walletwiseapi.controllers.UsersController;
import com.demo.walletwiseapi.dtos.UserDto;
import com.demo.walletwiseapi.models.Auth;
import com.demo.walletwiseapi.models.Users;
import com.demo.walletwiseapi.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersControllerImpl implements UsersController {

    private final UsersService usersService;

    public UsersControllerImpl(UsersService usersService) {
        this.usersService = usersService;
    }

    @Override
    public ResponseEntity<UserDto> createUser(UserDto userDto) {
        return ResponseEntity.ok(usersService.createUser(userDto));
    }

    @Override
    public ResponseEntity<UserDto> updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<UserDto> deleteUserByUserId(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<UserDto> getUserByUserId(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<UserDto> getUserByUserName(String userName) {
        return null;
    }
}
