plugins {
    java
    kotlin("jvm") version "1.3.70"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testCompile("junit", "junit", "4.12")

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.61")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-generate:0.2-alpha-1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-async:0.2-alpha-1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx:0.2-alpha-1")

}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}