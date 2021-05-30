plugins {
    java
    kotlin("jvm") version "1.5.20-M1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven(url = "https://jitpack.io")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
    implementation("com.github.d-lowl:KotlinDL:softmax-layer-SNAPSHOT")
}

task<JavaExec>("runTrain") {
    main = "space.dlowl.example.TrainKt"
    classpath = sourceSets.main.get().runtimeClasspath
}

task<JavaExec>("runImport") {
    main = "space.dlowl.example.ImportKt"
    classpath = sourceSets.main.get().runtimeClasspath
}