package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "recipe_ingredients")
class RecipeIngredientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    val ingredient: String? = null

    val quantity: String? = null

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    val recipeModel: RecipeModel? = null
}