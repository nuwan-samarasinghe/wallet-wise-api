package com.demo.walletwiseapi.services.impl;

import com.demo.walletwiseapi.dtos.UserDto;
import com.demo.walletwiseapi.models.Auth;
import com.demo.walletwiseapi.models.Users;
import com.demo.walletwiseapi.repositorys.UsersRepository;
import com.demo.walletwiseapi.services.UsersService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    private final PasswordEncoder passwordEncoder;
    private final UsersRepository usersRepository;

    public UsersServiceImpl(PasswordEncoder passwordEncoder,
                            UsersRepository usersRepository) {
        this.passwordEncoder = passwordEncoder;
        this.usersRepository = usersRepository;
    }

    @Override
    public Users getUserByUserName(String username) {
        return null;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        Users newUsers = new Users();
        newUsers.setFirstName(userDto.getFirstName());
        newUsers.setLastName(userDto.getLastName());
        Auth auth = new Auth();
        auth.setUsername(userDto.getUsername());
        auth.setPassword(passwordEncoder.encode(userDto.getPassword()));
        auth.setEmail(userDto.getEmail());
        newUsers.setAuth(auth);
        Users saved = usersRepository.save(newUsers);
        userDto.setUserId(saved.getId());
        userDto.setPassword(null);
        return userDto;
    }
}
