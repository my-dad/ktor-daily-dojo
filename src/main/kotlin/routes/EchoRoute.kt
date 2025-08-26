package com.date.with.routes

import com.date.with.endpoints.Echo
import com.date.with.endpoints.ErrorResponse
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get

fun Routing.echoRoute() {
    get("/echo/{name}") {
        val name = call.parameters["name"]?.trimIndent()
        if (name.isNullOrEmpty()) {
            return@get call.respond(
                HttpStatusCode.BadRequest,
                ErrorResponse("Name cannot be empty")
            )
        }

        call.respond(Echo(name = "Hello $name"))
    }
}