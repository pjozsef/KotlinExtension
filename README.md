# KotlinExtensionsCore

A simple repo containing some extension methods for core Java/Kotlin.

##Usage
* Clone this repository `git clone https://github.com/pjozsef/KotlinExtensionsCore.git`
* Build locally 
  * `./gradlew build` on Linux
  * `./gradlew.bat build` on Windows
* Install to local maven repository
  * `./gradlew install` on Linux
  * `./gradlew.bat install` on Windows
* Now you can declare it as a dependency:

Maven:
```xml
<dependency>
  <groupId>com.github.pjozsef</groupId>
  <artifactId>kotlin-kotlin-xtras</artifactId>
  <version>0.1.0</version>
</dependency>
```

Gradle:
```groovy
compile 'com.github.pjozsef:kotlin-xtras:0.1.0'
```
*Dont forget to add mavenLocal() in your build.gradle if you want to use the library in other projects.*

##Features
To see how these extension methods could help you, take a look at the  [Demo.kt](https://github.com/pjozsef/KotlinXtras/blob/master/src/main/kotlin/examples/Demo.kt) file.
