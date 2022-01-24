package com.softhere.apisctrade.service

import com.softhere.apisctrade.model.User
import com.softhere.apisctrade.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UserService {

    @Autowired
    UserRepository repository

    def save (User user) {
        try {
            repository.save(user)
        }
        catch(Exception  e) {
            return e.getCause().getMessage()
        }

    }

    List<User> findAll () {
        return repository.findAll()
    }

    def findById(Integer id) {
        Optional<User> user = repository.findById(id)
        if (user){
            return user
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

    def update(User user) {
        Optional<User> optionalUser = repository.findById(user.id)
        if (optionalUser.isPresent()){
            User updatedUser = user
            repository.save(updatedUser)
            return updatedUser
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

    def delete(Integer id) {
        Optional<User> user = this.findById(id);
        if (user) {
            try {
                repository.deleteById(id)
            } catch(Exception e){
                return e.getCause().getMessage()
            }
            return user
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }

}
