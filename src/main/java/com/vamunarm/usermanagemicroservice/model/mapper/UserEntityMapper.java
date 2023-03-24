package com.vamunarm.usermanagemicroservice.model.mapper;

import com.vamunarm.usermanagemicroservice.dto.UserDto;
import com.vamunarm.usermanagemicroservice.model.UserEntity;

public class UserEntityMapper {
    public UserEntity mapToEntity(UserDto userDto) {
        return new UserEntity()
                .setEmail(userDto.getEmail())
                .setPassword(userDto.getPassword())
                .setFullName(userDto.getFullName());
    }
}
