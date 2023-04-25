package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "users")
class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: String? = null

    @Column(name = "full_name")
    val fullName: String? = null

    @Column(name = "email")
    val email: String? = null

    @Column(name = "image")
    val image: Int? = null

    @OneToMany(mappedBy = "userModel")
    val categories: List<CategoryModel>? = null

}