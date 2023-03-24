package com.vamunarm.usermanagemicroservice.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class UserDto {
    private String fullName;
    private String password;
    private String email;
}
