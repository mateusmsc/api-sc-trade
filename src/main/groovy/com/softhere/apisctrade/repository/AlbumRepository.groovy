package com.softhere.apisctrade.repository

import com.softhere.apisctrade.model.Album
import org.springframework.data.repository.CrudRepository

interface AlbumRepository extends CrudRepository<Album, Integer>{

}