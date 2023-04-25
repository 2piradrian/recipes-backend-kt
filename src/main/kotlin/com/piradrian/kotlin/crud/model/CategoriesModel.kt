package com.piradrian.kotlin.crud.model

import javax.persistence.*

@Entity
@Table(name = "categories")
class CategoriesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    val name: String? = null

    @ManyToOne
    @JoinColumn(name = "user_id")
    val userModel: UserModel? = null

}