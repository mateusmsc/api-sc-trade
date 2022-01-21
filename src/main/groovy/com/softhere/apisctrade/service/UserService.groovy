package com.softhere.apisctrade.service

import com.softhere.apisctrade.model.User
import com.softhere.apisctrade.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.ResponseStatus

@Service
class UserService {

    @Autowired
    private UserRepository repository

    User save (User user) {
        //TODO : Realizar as validações e tratamento de erro
        return repository.save(user)
    }

    List<User> findAll () {
        return repository.findAll()
    }

    def findById(Integer id) {
        //TODO: Validar antes de devolver
        return repository.findById(id)
    }


}
