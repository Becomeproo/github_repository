package com.example.githubrepositoryapp

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {

    private const val BASE_URL = "https://api.github.com/"

    // 6. 헤더 부분 수정 - 여러 번 호출할 필요없이 해당 블록을 추가해 retrofit에 추가
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor {
            val request = it.request()
                .newBuilder()
                .addHeader(GITHUB_TOKEN_NAME, GITHUB_TOKEN_VALUE)
                .build()
            it.proceed(request)
        }
        .build()

    // 1. 레포 가져오기 - retrofit 생성
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


}