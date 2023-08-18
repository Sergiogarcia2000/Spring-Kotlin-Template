package com.backend.template.controllers

import com.backend.template.models.User
import com.backend.template.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): ResponseEntity<User> {
        val user: Optional<User> = userService.findById(id)
        return if (user.isPresent)
            ResponseEntity.ok(user.get())
        else
            ResponseEntity.status(HttpStatus.NOT_FOUND).body(null)
    }
}