package com.softhere.apisctrade.controller

import com.softhere.apisctrade.model.User
import com.softhere.apisctrade.repository.UserRepository
import com.softhere.apisctrade.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@Controller
@RequestMapping(path = "/user")
class UserController {

    @Autowired
    private UserService service

    @Autowired
    private UserRepository repository

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus( HttpStatus.CREATED )
    @ResponseBody String create(@RequestBody User user){
        return service.save(user)
    }

    @GetMapping
    @ResponseBody List<User> findAll(){
        return service.findAll()
    }

    @GetMapping( value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody ResponseEntity<User> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id))
    }
}
