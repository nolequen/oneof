plugins {
    id("java")
}

group = "io.upwake.oneof"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:18.0.0")
}

tasks.register<GenerateOneOf>("generate") {
    group = "build"
    template = "oneof.ftl"
    key = "oneof"
    count = 9
}
