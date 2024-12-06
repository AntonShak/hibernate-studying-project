package com.shakov.dto;

import com.shakov.entity.PersonalInfo;
import com.shakov.entity.Role;

public record UserReadDto(Long id,
                          PersonalInfo personalInfo,
                          String username,
                          String info,
                          Role role,
                          CompanyReadDto company) {
}
