package com.date.with.endpoints

import kotlinx.serialization.Serializable

@Serializable
data class ErrorResponse(val error: String? = null)
