package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "recipes")
class RecipeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    val name: String? = null

    val category: String? = null

    val time: String? = null

    val description: String? = null

    val image: String? = null

    val authorname: String? = null

    val authorphoto: String? = null

    @ManyToOne
    @JoinColumn(name = "user_id")
    val authoruid: UserModel? = null

    // ManyToMany con tabla auxiliar
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipeModel")
    val ingredients: List<RecipeIngredientModel>? = null

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipeModel")
    val steps: List<RecipeStepModel>? = null


}