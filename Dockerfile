FROM openjdk:8
COPY ./target/SPE_Miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE_Miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]