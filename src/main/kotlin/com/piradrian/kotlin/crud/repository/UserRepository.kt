package com.piradrian.kotlin.crud.repository

import com.piradrian.kotlin.crud.model.UserModel
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserModel, Long> {
}