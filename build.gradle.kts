plugins {
    id("java")
}

group = "com.example"
version = "1.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.9.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.9.2")

    testImplementation("org.assertj:assertj-core:3.24.2")
    implementation("com.google.guava:guava:32.1.2-jre")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}