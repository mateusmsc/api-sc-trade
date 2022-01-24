package com.softhere.apisctrade.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotBlank(message = "Nickname eh obrigatorio")
    String nickname

    @NotBlank (message = "Email eh obrigatorio")
    String email

    @NotBlank(message = "Password eh obrigatorio")
    String password

    @NotBlank(message = "Phone eh obrigatorio")
    String phone

    @NotBlank(message = "Birthdate eh obrigatorio")
    String birthday

}
