package com.demo.springbootdemoapi.services;

import com.demo.springbootdemoapi.models.Auth;

import java.util.List;

public interface AuthService {

    Auth getAuthByUserName(String username);

    List<Auth> getAllUsers();
}
