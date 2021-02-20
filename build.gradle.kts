buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(com.lomovskiy.lib.template.buildsrc.Config.GradlePlugins.kotlin)
        classpath(com.lomovskiy.lib.template.buildsrc.Config.GradlePlugins.android)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven {
            setUrl("https://jitpack.io")
        }
    }
}
