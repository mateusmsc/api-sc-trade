package com.softhere.apisctrade.model

import com.sun.istack.NotNull
import org.aspectj.weaver.ast.Not

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class Sticker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id


    @NotNull
    Integer number

    @NotNull
    @OneToOne
    @JoinColumn (name = "id_section")
    Section section


}
