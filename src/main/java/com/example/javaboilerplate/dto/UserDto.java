package com.example.javaboilerplate.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
  public String firstName;
  public String lastName;
  public String email;
  public String contactNumber;
  public Integer age;
}
