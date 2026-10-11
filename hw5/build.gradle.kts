plugins {
    kotlin("jvm")
    application
}

kotlin {
    jvmToolchain(24) // Menyesuaikan dengan batas maksimal yang didukung Kotlin saat ini
}
