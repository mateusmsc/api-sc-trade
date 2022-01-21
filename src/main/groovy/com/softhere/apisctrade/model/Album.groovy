package com.softhere.apisctrade.model

import groovyjarjarantlr4.v4.runtime.misc.NotNull
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "album")
class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_user")
    User user

    @NotNull
    String name

}
