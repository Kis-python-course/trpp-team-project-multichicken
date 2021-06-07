plugins {
    java
    kotlin("jvm") version "1.4.32"
    id("org.openjfx.javafxplugin") version "0.0.10"
}

sourceSets["main"].java {srcDir("src/main/java")}
sourceSets["main"].resources {srcDir("src/main/java/research")}

javafx {
    version = "16"
    modules("javafx.controls", "javafx.fxml")
    sdk = "C:/Program Files/Java/javafx-sdk-16"
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

