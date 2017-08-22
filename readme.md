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
- [X] Bootstrap Spring MVC Java Config
- [X] Bootstrap Spring MVC XML Config
- [X] Spring Security Authentication/Authorization.
- [X] Spring Multi-part file upload.
- [ ] Spring Profile
- [ ] Spring Reactive Web
