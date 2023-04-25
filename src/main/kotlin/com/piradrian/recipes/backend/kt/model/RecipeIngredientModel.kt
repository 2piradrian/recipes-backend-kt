package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "recipe_ingredients")
class RecipeIngredientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var ingredient: String? = null

    var quantity: String? = null

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    var recipeModel: RecipeModel? = null
}