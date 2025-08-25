package com.date.with.models

import com.typesafe.config.ConfigException
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DefaultStatus(
    val status: String? = null,
    val message: String? = null
)
