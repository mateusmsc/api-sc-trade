package com.softhere.apisctrade.model.dto

import com.fasterxml.jackson.annotation.JsonFormat

import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import java.time.LocalDate

class UserDTO {

    Integer id

    @NotBlank(message = "Nickname eh obrigatorio")
    String nickname

    @NotBlank (message = "Email eh obrigatorio")
    @Email
    String email

    @NotBlank(message = "Password eh obrigatorio")
    String password

    @NotBlank(message = "Phone eh obrigatorio")
    String phone

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    LocalDate birthday
}
