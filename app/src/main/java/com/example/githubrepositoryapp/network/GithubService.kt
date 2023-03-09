package com.example.githubrepositoryapp.network

import com.example.githubrepositoryapp.model.Repo
import com.example.githubrepositoryapp.model.UserDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {

    // 1. 레포 가져오기 - 레포를 받아올 api 값 설정
    @GET("users/{username}/repos")
    fun listRepos(@Path("username") username: String, @Query("page")page: Int): Call<List<Repo>>

    // 2. 유저 검색 후 가져오기 - 유저 값 검색을 위한 쿼리문 설정
    @GET("search/users")
    fun searchUsers(@Query("q") query: String): Call<UserDto>

}