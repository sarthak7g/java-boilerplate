package com.example.javaboilerplate.service.impl;

import com.example.javaboilerplate.dto.UserDto;
import com.example.javaboilerplate.entity.User;
import com.example.javaboilerplate.repository.UserRepository;
import com.example.javaboilerplate.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;


@Data
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Collection<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(o -> o.to()).collect(Collectors.toList());
    }
    public UserDto getUser(Long id) throws Exception {

        User user = userRepository.findById(id).orElseThrow(() -> new Exception("User not found"));
        return user.to();
    }

    @Override
    public void addUser(UserDto userDto) {
        userRepository.save(User.convert(userDto));
    }
}
