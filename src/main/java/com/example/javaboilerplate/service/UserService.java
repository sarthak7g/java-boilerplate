package com.example.javaboilerplate.service;

import com.example.javaboilerplate.dto.UserDto;
import com.example.javaboilerplate.entity.User;

import java.util.Collection;

public interface UserService {
    Collection<UserDto> getAllUsers();

    UserDto getUser(Long id) throws Exception;

    void addUser(UserDto userDto);
}
