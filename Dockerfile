FROM eclipse-temurin:11

RUN mkdir /opt/app

COPY target/quarkus-app/ /opt/app

EXPOSE 8080

CMD ["java","-jar","/opt/app/quarkus-run.jar"]
