FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/moon.jar /moon/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/moon/app.jar"]
