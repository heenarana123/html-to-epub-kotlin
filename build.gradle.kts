import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    application
}

group = "me.youi"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://maven.aliyun.com/nexus/content/groups/public/")
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-simple:1.7.32")
    implementation("org.apache.tika:tika-core:2.1.0")
    implementation("net.kemitix:epub-creator:1.1.0")
    implementation("net.sf.jmimemagic:jmimemagic:0.1.5")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2-native-mt")
    implementation("com.squareup.okhttp3:okhttp:4.9.2")
    implementation("commons-cli:commons-cli:1.4")
    implementation("org.jsoup:jsoup:1.14.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}
