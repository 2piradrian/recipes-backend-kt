package com.piradrian.recipes.backend.kt.repository

import com.piradrian.recipes.backend.kt.model.UserModel
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserModel, Long> {
}