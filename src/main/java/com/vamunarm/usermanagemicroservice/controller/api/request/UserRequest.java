package com.vamunarm.usermanagemicroservice.controller.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRequest {

    @JsonProperty("name")
    private String fullName;
    private String password;
    private String email;
}
