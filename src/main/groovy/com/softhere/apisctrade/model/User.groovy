package com.softhere.apisctrade.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    Integer id

    @Column(name ="nickname")
    String nickname

    @Column(name ="email")
    String email

    @Column(name ="password")
    String password

    @Column(name ="phone")
    String phone

    @Column(name ="birthday")
    LocalDate birthday

}
