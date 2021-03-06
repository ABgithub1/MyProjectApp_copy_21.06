package com.example.myprojectapp.usecase

import com.example.myprojectapp.model.news.Article
import com.example.myprojectapp.repository.NewsRemoteRepository
import kotlinx.coroutines.flow.*

class GetTopHeadlinesNewsUseCase(private val repository: NewsRemoteRepository) {

    suspend operator fun invoke(page: Int): Result<List<Article>> {
        return repository.getTopHeadlinesNews(page = page)
    }

}
