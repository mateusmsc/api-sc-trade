package com.softhere.apisctrade.repository

import com.softhere.apisctrade.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository extends CrudRepository<User, Integer> {

}