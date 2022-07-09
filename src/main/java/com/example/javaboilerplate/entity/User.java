package com.example.javaboilerplate.entity;

import com.example.javaboilerplate.dto.UserDto;
import com.example.javaboilerplate.entity.base.BaseAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User extends BaseAuditableEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "age")
    private Integer age;

    public UserDto to(){
        return UserDto.builder()
                .age(this.getAge())
                .contactNumber(this.getContactNumber())
                .firstName(this.getFirstName())
                .lastName(this.getLastName())
                .email(this.getEmail())
                .build();
    }

    public static User convert(UserDto userDto) {
        return User.builder()
                .age(userDto.getAge())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .contactNumber(userDto.getContactNumber())
                .email(userDto.getEmail())
                .build();
    }
}
