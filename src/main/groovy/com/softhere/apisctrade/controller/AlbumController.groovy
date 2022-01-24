package com.softhere.apisctrade.controller

import com.softhere.apisctrade.model.Album
import com.softhere.apisctrade.service.AlbumService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping(path = "/album")
class AlbumController {
    @Autowired
    private AlbumService service

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody ResponseEntity<List<Album>> findAll(){
        return ResponseEntity.ok(service.findAll())
    }
}
