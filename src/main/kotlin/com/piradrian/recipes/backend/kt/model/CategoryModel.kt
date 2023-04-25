package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "categories")
class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    val name: String? = null

    @ManyToOne
    @JoinColumn(name = "user_id")
    val userModel: UserModel? = null

}