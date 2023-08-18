package com.backend.template.services

import com.backend.template.models.User
import com.backend.template.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(@Autowired val userRepository: UserRepository) {

    fun findById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }
}