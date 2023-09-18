package com.demo.springbootdemoapi.services;

import com.demo.springbootdemoapi.dtos.UserDto;
import com.demo.springbootdemoapi.models.Users;

public interface UsersService {

    Users getUserByUserName(String username);

    Users createUser(UserDto userDto);

}
