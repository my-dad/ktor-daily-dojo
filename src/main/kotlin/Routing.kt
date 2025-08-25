package com.date.with

import com.date.with.models.DefaultStatus
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/health") {
            call.respond(DefaultStatus(message = "OK"))
        }
    }
}
