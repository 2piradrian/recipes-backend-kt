package com.piradrian.recipes.backend.kt.repository

import com.piradrian.recipes.backend.kt.model.RecipeStepModel
import org.springframework.data.jpa.repository.JpaRepository
interface RecipeStepRepository : JpaRepository<RecipeStepModel, Long> {
}