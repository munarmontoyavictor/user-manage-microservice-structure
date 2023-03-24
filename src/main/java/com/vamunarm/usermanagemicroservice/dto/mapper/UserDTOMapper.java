package com.vamunarm.usermanagemicroservice.dto.mapper;

import com.vamunarm.usermanagemicroservice.controller.api.request.UserRequest;
import com.vamunarm.usermanagemicroservice.dto.UserDto;

//Mapper RequestBody to DTO
public class UserDTOMapper {
    public UserDto mapRequestToDto(UserRequest userRequest){
        return new UserDto()
                .setEmail(userRequest.getEmail())
                .setFullName(userRequest.getFullName())
                .setPassword(userRequest.getPassword());
    }
}
