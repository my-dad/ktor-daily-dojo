package com.date.with.routes

import com.date.with.endpoints.ErrorResponse
import com.date.with.endpoints.Sum
import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get

fun Routing.sumRoute() {
    get("/math/sum") {
        val a = call.request.queryParameters["a"]?.toIntOrNull()
        val b = call.request.queryParameters["b"]?.toIntOrNull()


        if (a == null || b == null) {
            return@get call.respond(
                HttpStatusCode.BadRequest,
                ErrorResponse("a and b must be numbers")
            )
        }

        call.respond(Sum(a = a, b = b, sum = a + b))
    }
}