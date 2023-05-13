package com.example.cleanarchitecture.data.repository

import com.example.cleanarchitecture.domain.models.SaveUserNameParam
import com.example.cleanarchitecture.domain.models.UserName
import com.example.cleanarchitecture.domain.repository.UserRepository

class UserRepositoryImpl : UserRepository {

    override fun saveName(saveParam : SaveUserNameParam) : Boolean {
        return true
    }

    override fun getName(): UserName{
        return UserName("firstName" , "lastName")
    }
}