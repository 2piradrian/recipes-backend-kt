package com.piradrian.recipes.backend.kt.model

import javax.persistence.*

@Entity
@Table(name = "users")
class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null

    @Column(name = "full_name")
    var fullName: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "image")
    var image: Int? = null

    @OneToMany(mappedBy = "userModel")
    val categories: List<CategoriesModel>? = null

}