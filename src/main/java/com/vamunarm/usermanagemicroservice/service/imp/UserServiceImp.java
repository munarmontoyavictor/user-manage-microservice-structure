package com.vamunarm.usermanagemicroservice.service.imp;

import com.vamunarm.usermanagemicroservice.dto.UserDto;
import com.vamunarm.usermanagemicroservice.model.UserEntity;
import com.vamunarm.usermanagemicroservice.model.mapper.UserEntityMapper;
import com.vamunarm.usermanagemicroservice.repository.UserRepository;
import com.vamunarm.usermanagemicroservice.service.UserService;

public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity registerUser(UserDto userDto) {
        UserEntity user = new UserEntityMapper().mapToEntity(userDto);
        return userRepository.save(user);
    }
}
