package com.demo.walletwiseapi.services;

import com.demo.walletwiseapi.models.Auth;

import java.util.List;

public interface AuthService {

    Auth getAuthByUserName(String username);

    List<Auth> getAllUsers();
}
