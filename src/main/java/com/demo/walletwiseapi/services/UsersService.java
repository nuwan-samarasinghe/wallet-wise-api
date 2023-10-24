package com.demo.walletwiseapi.services;

import com.demo.walletwiseapi.dtos.UserDto;
import com.demo.walletwiseapi.models.Users;

public interface UsersService {

    Users getUserByUserName(String username);

    UserDto createUser(UserDto userDto);

}
