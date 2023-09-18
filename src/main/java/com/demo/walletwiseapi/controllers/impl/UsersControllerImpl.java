package com.demo.walletwiseapi.controllers.impl;

import com.demo.walletwiseapi.controllers.UsersController;
import com.demo.walletwiseapi.dtos.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersControllerImpl implements UsersController {
    @Override
    public ResponseEntity<UserDto> createUser() {
        return null;
    }

    @Override
    public ResponseEntity<UserDto> updateUser() {
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
