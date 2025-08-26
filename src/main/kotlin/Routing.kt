package com.date.with

import com.date.with.models.DefaultStatus
import com.date.with.routes.echoRoute
import com.date.with.routes.sumRoute
import io.ktor.server.application.Application
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/health") {
            call.respond(DefaultStatus(message = "OK"))
        }

        echoRoute()

        sumRoute()
    }
}
