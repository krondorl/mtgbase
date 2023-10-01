# Based on tutorial
# https://www.docker.com/blog/9-tips-for-containerizing-your-spring-boot-code/
FROM eclipse-temurin:17-jdk-jammy as builder
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY ./src ./src
RUN ./mvnw clean install
 
FROM eclipse-temurin:17-jre-jammy
WORKDIR /opt/app
EXPOSE 8080
COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
ENTRYPOINT ["java", "-jar", "/opt/app/*.jar" ]
#
# Build and run
# docker buildx build -t mtgbase-backend:v01 .
# docker run -p 8080:8080 mtgbase-backend:v01