package com.softhere.apisctrade.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id
    String description
}
