package com.adikrena.mysimplecleanarchitecture.di

import com.adikrena.mysimplecleanarchitecture.data.IMessageDataSource
import com.adikrena.mysimplecleanarchitecture.data.MessageDataSource
import com.adikrena.mysimplecleanarchitecture.data.MessageRepository
import com.adikrena.mysimplecleanarchitecture.domain.IMessageRepository
import com.adikrena.mysimplecleanarchitecture.domain.MessageInteractor
import com.adikrena.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}