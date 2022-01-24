package com.softhere.apisctrade.service

import com.softhere.apisctrade.model.Album
import com.softhere.apisctrade.repository.AlbumRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AlbumService {

    @Autowired
    AlbumRepository repository

    List<Album> findAll() {
        return repository.findAll()
    }

}
