package io.javabrains.springsecurityjwt.models;

import lombok.Data;

@Data
public class AuthenticationRequest {

    public String username;
    public String password;

}
