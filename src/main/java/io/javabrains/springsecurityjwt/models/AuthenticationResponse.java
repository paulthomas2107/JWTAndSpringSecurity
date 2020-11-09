package io.javabrains.springsecurityjwt.models;

import lombok.Data;

@Data
public class AuthenticationResponse {

    private final String jwt;
}
