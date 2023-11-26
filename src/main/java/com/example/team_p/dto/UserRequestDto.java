package com.example.team_p.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String username;
    @Pattern(regexp = "[a-z0-9]{4,10}$")
    private String userid;
    @Pattern(regexp = "[a-zA-Z0-9]{8,20}$")
    private String password;
    private String age;
    private String user_info;
    private String userurl;
}
