package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "likes")
class LikeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    // TODO: Add the recipe id
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    val recipeModel: RecipeModel? = null

    @ManyToOne
    @JoinColumn(name = "user_id")
    val userModel: UserModel? = null
}