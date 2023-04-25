package com.piradrian.recipes.backend.kt.controller

import com.piradrian.recipes.backend.kt.model.UserModel
import com.piradrian.recipes.backend.kt.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController {

    @Autowired
    lateinit var userRepository: UserRepository

    @PostMapping("/")
    fun createUser(@RequestBody user: UserModel): ResponseEntity<UserModel> {
        return ResponseEntity.ok(userRepository.save(user))
    }
}