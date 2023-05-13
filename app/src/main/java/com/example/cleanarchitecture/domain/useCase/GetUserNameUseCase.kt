package com.example.cleanarchitecture.domain.useCase

import com.example.cleanarchitecture.domain.models.UserName
import com.example.cleanarchitecture.domain.repository.UserRepository

class GetUserNameUseCase(private val repository : UserRepository) {

    fun execute(): UserName {

        return repository.getName()
    }
}