package com.adikrena.mysimplecleanarchitecture.data

import com.adikrena.mysimplecleanarchitecture.domain.IMessageRepository
import com.adikrena.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}