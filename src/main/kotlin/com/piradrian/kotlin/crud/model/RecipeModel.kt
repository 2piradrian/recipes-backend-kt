package com.piradrian.kotlin.crud.model

import javax.persistence.*

@Entity
@Table(name = "recipes")
class RecipeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var name: String? = null

    var category: String? = null

    var time: String? = null

    var description: String? = null

    var image: String? = null

    @ManyToOne
    @JoinColumn(name = "user_id")
    val userModel: UserModel? = null

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipeModel")
    var ingredients: List<RecipeIngredientModel>? = null

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipeModel")
    var steps: List<RecipeStepModel>? = null


}