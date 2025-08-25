# Ktor Daily Dojo

A day-by-day, objective-based Ktor learning journey. The rules:
- Minimal **boilerplate only** (no full solutions).
- Explain **what each class/plugin does** and **why it exists**.
- Slow, steady, and **daily** progress.

> I already know Kotlin; this repo tracks how I learn **backend + (later) frontend** with Ktor.

---

## Why this repo exists
Ktor isn’t a server by itself—it’s a framework that runs on an **engine** (I’m using **Netty**).  
This repo is my public log of what I learn each day: the *concepts*, tiny *boilerplate*, and *trade-offs*.

---

## Stack (so far)
- **Kotlin**
- **Ktor** (server)
- **Engine:** Netty
- **Serialization:** kotlinx.serialization via `ContentNegotiation`
- **Build:** Gradle (version catalog)
- **Logging:** Logback

---

## Project structure (high level)
├── src/main/kotlin/
│ ├── Application.kt # Application.module(): install plugins, wire routes
│ ├── Routing.kt # routing { ... } endpoints
│ └── api/ # tiny DTOs for API responses
│ ├── HealthDto.kt
│ ├── EchoDto.kt
│ ├── SumDto.kt
│ └── ErrorDto.kt
├── src/main/resources/
│ ├── application.yaml # port, module, env config
│ └── logback.xml # logging config
├── gradle/ # Gradle wrapper files
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md


> **Mental model:** Browser → **Netty** → Ktor **pipeline** → **Plugins** → **Routing** → Handler → Response.

---

## Getting started

**Prereqs**
- JDK 17+
- Kotlin + Gradle wrapper (repo includes `./gradlew`)

**Run**
```bash
./gradlew run
