plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("com.google.code.gson:gson:2.10.1")
}


tasks.withType<Wrapper> {
    gradleVersion = "8.0.2"
    distributionType = Wrapper.DistributionType.BIN
}


tasks {
    withType<Jar> {
        manifest {
            attributes["Main-Class"] = "org.example.App"
            archiveFileName.set("myname.jar")
        }
        // here zip stuff found in runtimeClasspath:
        from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    }
}
