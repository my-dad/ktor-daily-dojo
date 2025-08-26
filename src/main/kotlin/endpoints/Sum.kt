package com.date.with.endpoints

import kotlinx.serialization.Serializable

@Serializable
data class Sum(val a: Int? = null, val b: Int? = null, val sum: Int? = null)