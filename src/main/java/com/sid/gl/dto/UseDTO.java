package com.sid.gl.dto;

import com.sid.gl.enums.UserType;

public record UseDTO(String lastName, String firstName, String username, String password, UserType userType) {
}
