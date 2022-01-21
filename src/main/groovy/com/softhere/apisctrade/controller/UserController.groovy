package com.softhere.apisctrade.controller

import com.softhere.apisctrade.model.User
import com.softhere.apisctrade.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping(path = "/demo")
class UserController {

    @Autowired
    private UserRepository repository

    @PostMapping(path = "/add")
    @ResponseBody String create(@RequestBody User user){
        //User newUser = new User()
        user
        //newUser.setNickname(user.nickname)
        //user.setPassword("123")
        repository.save(user)
        return "salvou"
    }

    @GetMapping(path = "/all")
    @ResponseBody List<User> getAll(){
        return repository.findAll()
    }
}
