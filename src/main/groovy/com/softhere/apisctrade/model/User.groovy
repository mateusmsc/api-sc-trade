package com.softhere.apisctrade.model

import com.sun.istack.NotNull
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    String nickname

    @NotNull
    String password

    @NotNull
    String phone

    @NotNull
    String birthday

}
