package com.example.recepieappsample.repository

import com.example.recepieappsample.domain.model.Recipe
import com.example.recepieappsample.network.RecipeService
import com.example.recepieappsample.network.model.RecipeDtoMapper

class RecipeRepository_Impt (
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
): RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        val result = recipeService.search(token,page,query).recipes
        return mapper.toDomainList(result)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        val result = recipeService.get(token,id)
        return mapper.mapToDomainModel(result)
    }
}