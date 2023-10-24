package com.demo.walletwiseapi.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private String userId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
}
