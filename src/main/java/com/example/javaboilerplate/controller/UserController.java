package com.example.javaboilerplate.controller;

import com.example.javaboilerplate.dto.UserDto;
import com.example.javaboilerplate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

  private final UserService userService;

  /**
   * This method will get all users
  **/
  @RequestMapping(value = "", method = RequestMethod.GET)
  public Collection<UserDto> getAll() {
    return userService.getAllUsers();
  }

  /**
   * This method will get a user by Id
   **/
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public UserDto get(@PathVariable long id) throws Exception {
    return userService.getUser(id);
  }

  /**
   * This method will create a user
   **/
  @RequestMapping(value = "", method = RequestMethod.POST)
  public String add(@RequestBody UserDto userDto) {
    userService.addUser(userDto);
    return "User Created!";
  }

}
