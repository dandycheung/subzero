/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("com.squareup.subzero.java-conventions")
}

description = "fake_ncipher"

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            groupId = group.toString()
            artifactId = "fake_ncipher"
            version = version
            from(components["java"])
        }
    }
}