package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "recipe_steps")
class RecipeStepModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    val description: String? = null

    val image: String? = null

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    val recipeModel: RecipeModel? = null
}