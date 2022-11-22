#./mvnw package && java -jar target/Gateway-0.0.1-SNAPSHOT.jar

FROM openjdk:17-oracle
EXPOSE 8084
ARG JAR_FILE=target/Gateway-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]

#docker build -t Gateway:0.0.1 .

#docker build --no-cache -t gateway:0.0.1 .
#docker build --no-cache -t gateway .