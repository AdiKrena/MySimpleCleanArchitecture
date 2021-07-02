package com.adikrena.mysimplecleanarchitecture.data

import com.adikrena.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}