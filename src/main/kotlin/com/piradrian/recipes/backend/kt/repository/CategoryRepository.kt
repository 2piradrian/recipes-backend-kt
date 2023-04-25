package com.piradrian.recipes.backend.kt.repository

import com.piradrian.recipes.backend.kt.model.CategoryModel
import org.springframework.data.jpa.repository.JpaRepository
interface CategoryRepository : JpaRepository<CategoryModel, Long> {
}