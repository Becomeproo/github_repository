package com.example.githubrepositoryapp.model

import com.google.gson.annotations.SerializedName

// 2. 유저 검색 후 가져오기 - Dto 클래스 생성(데이터 response 값의 형태가 레포 가져오기 때와는 달리 객체로 한 번 더 감싸져 있기 때문
// Dto(Data transfer object)
data class UserDto(
    @SerializedName("total_count")
    val totalCount: Int,
    @SerializedName("items")
    val items: List<User>
)