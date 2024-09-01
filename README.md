### Publishing to Local Maven Repository

To publish your project’s artifacts to your local Maven repository, follow these steps:

1. **Configure Your `build.gradle` File**

   Ensure your `build.gradle` file includes the `maven-publish` plugin and the necessary configuration. Here’s an example configuration:

   ```groovy
   plugins {
       id 'java'
       id 'maven-publish'
   }

   publishing {
       publications {
           mavenJava(MavenPublication) {
               from components.java
               groupId = 'com.example'
               artifactId = 'your-artifact-id'
               version = '1.0.0'
           }
       }
       repositories {
           mavenLocal()
       }
   }
   
#### Run this Command to publish your project's artifacts to your local Maven repository
```groovy
   ./gradlew publishToMavenLocal


