package com.piradrian.recipes.backend.kt.controller

import com.piradrian.recipes.backend.kt.model.RecipeModel
import com.piradrian.recipes.backend.kt.repository.RecipeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/recipes")
class RecipeController {

    @Autowired
    lateinit var recipeRepository: RecipeRepository

    @PostMapping("/")
    fun createRecipe(@RequestBody recipe: RecipeModel): ResponseEntity<RecipeModel> {
        return ResponseEntity.ok(recipeRepository.save(recipe))
    }

    @PutMapping("/{id}")
    fun updateRecipe(@RequestBody recipe: RecipeModel): ResponseEntity<RecipeModel> {
        return ResponseEntity.ok(recipeRepository.save(recipe))
    }

    @GetMapping("/{id}")
    fun getRecipeById(id: Long): ResponseEntity<RecipeModel> {
        return ResponseEntity.ok(recipeRepository.findById(id).get())
    }

    @GetMapping("/")
    fun getRecipes(): ResponseEntity<List<RecipeModel>> {
        return ResponseEntity.ok(recipeRepository.findAll())
    }

}