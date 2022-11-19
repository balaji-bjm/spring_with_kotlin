package com.bluemoon.demokt.service

import com.bluemoon.demokt.entity.User
import com.bluemoon.demokt.repo.UserRepo
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(val userRepo: UserRepo) {

    fun getUserById(id:Long) : Optional<User> {
        return userRepo.findById(id)
    }

    fun saveUser(user: User) : User {
        return userRepo.save(user)
    }

    fun getAllEmployees(): MutableIterable<User> {
        return userRepo.findAll()
    }

    fun deleteUser(id: Long) {
        return userRepo.deleteById(id)
    }

}