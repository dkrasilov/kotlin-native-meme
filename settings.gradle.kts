pluginManagement {
    repositories {
        maven(url = "https://nexus.sberdevices.ru/repository/gradle-proxy/")
    }
}
dependencyResolutionManagement {
    repositories {
        maven(url = "https://nexus.sberdevices.ru/repository/maven-central/")
    }
}

rootProject.name = "ihub-runner-spy"