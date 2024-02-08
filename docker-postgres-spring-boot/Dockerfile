FROM amazoncorretto:17-alpine-jdk
WORKDIR /app
# Install Maven
RUN apk add --no-cache maven

# Copy your project files and build the project
COPY . .
RUN mvn clean install -DskipTests
ENTRYPOINT ["java","-jar","target/docker-postgres-spring-boot-1.0.jar"]
