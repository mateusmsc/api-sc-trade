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
@Table(name = "sticker_trade")
class StickerTrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @OneToOne
    @JoinColumn (name = "id_user_receiver")
    User userReceiver

    @NotNull
    @OneToOne
    @JoinColumn (name = "id_user_sender")
    User userSender

    @NotNull
    @OneToOne
    @JoinColumn (name = "id_sticker_receiver")
    Sticker stickerReceiver

    @NotNull
    @OneToOne
    @JoinColumn (name = "id_sticker_receiver")
    Sticker stickerSender

    String status


}
