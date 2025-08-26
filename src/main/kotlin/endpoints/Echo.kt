package com.date.with.endpoints

import kotlinx.serialization.Serializable

@Serializable
data class Echo(
    val name: String? = null
)