package com.example.githubrepositoryapp.model

import com.google.gson.annotations.SerializedName

// 1. 레포 가져오기 - 가져올 레포의 데이터 클래스
// SerializedName 어노테이션: 실제 데이터의 키 이름과 매핑
data class Repo(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("language")
    val language: String?,
    @SerializedName("stargazers_count")
    val startCount: Int,
    @SerializedName("forks_count")
    val forkCount: Int,
    @SerializedName("html_url")
    val htmlUrl: String
)