pluginManagement {
    repositories {
        maven { url 'https://nexus.sberdevices.ru/repository/gradle-proxy/' }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        maven { url 'https://nexus.sberdevices.ru/repository/maven-central/' }
    }
}

rootProject.name = "ihub-runner-spy"