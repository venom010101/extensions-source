gradle.beforeSettings {
    pluginManagement {
        repositories {
            maven {
                url = uri("https://maven.aliyun.com/repository/google")
            }
            maven {
                url = uri("https://maven.aliyun.com/repository/central")
            }
            maven {
                url = uri("https://maven.aliyun.com/repository/gradle-plugin")
            }
            maven {
                url = uri("https://repo.huaweicloud.com/repository/maven/")
            }
            maven {
                url = uri("https://plugins.gradle.org/m2/")
            }
            mavenCentral()
            gradlePluginPortal()
        }
    }
}

gradle.settingsEvaluated {
    dependencyResolutionManagement {
        repositories {
            maven {
                url = uri("https://maven.aliyun.com/repository/google")
                content {
                    includeGroupByRegex("com\\.android.*")
                    includeGroupByRegex("com\\.google.*")
                    includeGroupByRegex("androidx.*")
                }
            }
            maven {
                url = uri("https://maven.aliyun.com/repository/central")
            }
        }
    }
}
