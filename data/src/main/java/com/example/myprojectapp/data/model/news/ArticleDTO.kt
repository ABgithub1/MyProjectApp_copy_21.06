package com.example.myprojectapp.data.model.news

data class ArticleDTO(
    val id: Long,
    val author: String? = null,
    val content: String? = null,
    val description: String? = null,
    val publishedAt: String? = null,
    val source: SourceDTO? = null,
    val title: String? = null,
    val url: String? = null,
    val urlToImage: String? = null
)
