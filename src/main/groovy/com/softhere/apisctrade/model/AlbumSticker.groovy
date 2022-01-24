package com.softhere.apisctrade.model

import com.sun.istack.NotNull

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table (name = "album_sticker")
class AlbumSticker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @OneToOne
    @JoinColumn (name = "id_album")
    Album album

    @NotNull
    @OneToOne
    @JoinColumn (name = "id_sticker")
    Sticker sticker

    Integer quantity

}
