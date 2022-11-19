package com.bluemoon.demokt.controller

import com.bluemoon.demokt.entity.User
import com.bluemoon.demokt.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserController(val userService: UserService) {

    @GetMapping("/{id}")
    public fun getUserById(@PathVariable id: Long): String{
        return userService.getUserById(id).get().name
    }

    @PostMapping
    public fun saveUser(@RequestBody user: User) :User {
        return userService.saveUser(user)
    }

    @PutMapping
    public fun updateUser(@RequestBody user: User) :User {
        return userService.saveUser(user)
    }

    @GetMapping
    public fun getAllEmployees() : MutableIterable<User> {
        System.out.println("s");
        return userService.getAllEmployees()
    }

    @DeleteMapping("/{id}")
    public fun deleteUser(@PathVariable id: Long) {
        return userService.deleteUser(id)
    }
}