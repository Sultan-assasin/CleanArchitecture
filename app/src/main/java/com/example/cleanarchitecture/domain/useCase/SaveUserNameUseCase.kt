package com.example.cleanarchitecture.domain.useCase

import com.example.cleanarchitecture.domain.models.SaveUserNameParam
import com.example.cleanarchitecture.domain.repository.UserRepository

class SaveUserNameUseCase(private val repository : UserRepository) {

    fun execute(param : SaveUserNameParam) : Boolean{
        return repository.saveName(param)
    }
}