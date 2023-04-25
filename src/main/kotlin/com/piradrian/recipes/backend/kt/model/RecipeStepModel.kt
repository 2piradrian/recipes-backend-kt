package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "recipe_steps")
class RecipeStepModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var description: String? = null

    var image: String? = null

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    var recipeModel: RecipeModel? = null
}