package com.example.githubrepositoryapp.model

import com.google.gson.annotations.SerializedName

// 2. 유저 검색 후 가져오기 - UserDto의 items 키 값의 내용을 가져오기 위해 유저 정보를 가진 데이터 클래스 생성
data class User(
    @SerializedName("id")
    val id: Int,
    @SerializedName("login")
    val userName: String,
)
