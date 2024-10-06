package com.github.ram02z.kaka

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform