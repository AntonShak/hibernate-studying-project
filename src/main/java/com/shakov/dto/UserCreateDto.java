package com.shakov.dto;

import com.shakov.entity.PersonalInfo;
import com.shakov.entity.Role;
import com.shakov.validation.UpdateCheck;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public record UserCreateDto(
                            @Valid
                            PersonalInfo personalInfo,
                            @NotNull
                            String username,
                            String info,
                            @NotNull(groups = UpdateCheck.class)
                            Role role,
//                            @ValidCompany
                            Integer companyId) {
}
