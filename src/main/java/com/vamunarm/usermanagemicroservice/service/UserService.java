package com.vamunarm.usermanagemicroservice.service;

import com.vamunarm.usermanagemicroservice.dto.UserDto;
import com.vamunarm.usermanagemicroservice.model.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserEntity registerUser(UserDto userDto);
}
