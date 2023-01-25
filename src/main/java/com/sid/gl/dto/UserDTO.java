package com.sid.gl.dto;

import com.sid.gl.enums.UserType;

public record UserDTO(String lastName, String firstName, String username, String password, UserType userType) {
}
