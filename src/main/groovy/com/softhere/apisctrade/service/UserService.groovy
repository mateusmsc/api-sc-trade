package com.softhere.apisctrade.service

import com.softhere.apisctrade.model.User
import com.softhere.apisctrade.model.dto.UserDTO
import com.softhere.apisctrade.repository.UserRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

import java.time.LocalDate
import java.util.stream.Collectors

@Service
class UserService {

    @Autowired
    UserRepository repository

    @Autowired
    ModelMapper mapper

    def save (UserDTO userDTO) {
        try {
            if (!(userDTO.birthday)){
                userDTO.birthday = LocalDate.now()
            }
            return this.toDto(repository.save(this.toEntity(userDTO)))
        }
        catch(Exception  e) {
            return e.getCause().getMessage()
        }

    }

    List<User> findAll () {
        return repository.findAll().stream().map(this::toDto).collect(Collectors.toList())
    }

    def findById(Integer id) {
        Optional<User> optionalUser = repository.findById(id)

        if (optionalUser.isPresent()){
            return this.toDto(optionalUser.get())
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

    def update(UserDTO userDTO) {
        Optional<User> optionalUser = repository.findById(userDTO.id)

        if (optionalUser.isPresent()){
            return this.toDto(repository.save(this.toEntity(userDTO)))
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

    def delete(Integer id) {
        Optional<User> optionalUser = repository.findById(id)

        if (optionalUser.isPresent()) {
            try {
                repository.deleteById(id)
                return this.toDto(optionalUser.get())
            } catch(Exception e){
                return e.getCause().getMessage()
            }
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

    UserDTO toDto(User user){
        return mapper.map(user, UserDTO.class)
    }

    User toEntity(UserDTO userDTO){
        return mapper.map(userDTO, User.class)
    }

}
