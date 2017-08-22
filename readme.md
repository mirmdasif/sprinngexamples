Building The Projects
---------------------
- Install JDK 8
- ```./gradlew clean build``` (For Linux)
- ```./gradlew.bat clean build``` (For Windows)

Running Tasks of a Sub Project 
------------------------------
- ./gradlew :subproject-name:taskname

Example

    ./gradlew :springmvcjava:tomcatRunWar

Todo's
-----
- [ ] Spring Profile
- [ ] Spring Reactive Web
