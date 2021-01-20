FROM openjdk:8
ADD target/gestionDeptContentieux-0.0.1-SNAPSHOT.jar gestionDeptContentieux-0.0.1-SNAPSHOT.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","gestionDeptContentieux-0.0.1-SNAPSHOT.jar"]