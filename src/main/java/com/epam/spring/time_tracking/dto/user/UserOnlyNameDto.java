package com.epam.spring.time_tracking.dto.user;

import lombok.Data;

@Data
public class UserOnlyNameDto {

    private Long id;
    private String lastName;
    private String firstName;

}
