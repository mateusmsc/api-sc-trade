package com.softhere.apisctrade.controller

import com.softhere.apisctrade.model.dto.UserDTO
import com.softhere.apisctrade.service.UserService
import com.softhere.apisctrade.validators.Validator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

import javax.validation.Valid

@RestController
@RequestMapping(path = "/user")
class UserController extends Validator {

    @Autowired
    private UserService service

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus( HttpStatus.CREATED )
    @ResponseBody
    ResponseEntity<UserDTO> create(@RequestBody @Valid UserDTO userDTO){
        return ResponseEntity.ok(service.save(userDTO))
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseEntity<UserDTO> update (@RequestBody @Valid UserDTO userDTO) {
        return ResponseEntity.ok(service.update(userDTO))
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    List<UserDTO> findAll(){
        return service.findAll()
    }

    @GetMapping( value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id))
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    ResponseEntity<UserDTO> delete(@PathVariable Integer id){
        return ResponseEntity.ok(service.delete(id))
    }

}
