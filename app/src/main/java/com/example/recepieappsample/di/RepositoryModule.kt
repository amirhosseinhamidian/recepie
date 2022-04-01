package com.example.recepieappsample.di

import com.example.recepieappsample.network.RecipeService
import com.example.recepieappsample.network.model.RecipeDtoMapper
import com.example.recepieappsample.repository.RecipeRepository
import com.example.recepieappsample.repository.RecipeRepository_Impt
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository{
        return RecipeRepository_Impt(recipeService,recipeDtoMapper)
    }
}