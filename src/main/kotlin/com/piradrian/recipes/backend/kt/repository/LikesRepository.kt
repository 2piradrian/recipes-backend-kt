package com.piradrian.recipes.backend.kt.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.piradrian.recipes.backend.kt.model.LikesModel
interface LikesRepository : JpaRepository<LikesModel, Long> {
}