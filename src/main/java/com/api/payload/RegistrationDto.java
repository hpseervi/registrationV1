package com.api.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {

    @NotBlank(message = "Name is mandatory and it shouldn't be null, empty or blank")
    @Size(min=2, message = "Name should be of minimun 2 letters")
    private String name;

    @Email(message = "Email must be in proper format")
    private String email;

    @Size(min = 7, max = 7, message = "Mobile number should be in 7 digits")
    private String mobile;

}