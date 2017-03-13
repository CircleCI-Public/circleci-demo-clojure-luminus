FROM openjdk:8
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/cci-demo-clojure.jar /cci-demo-clojure/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/cci-demo-clojure/app.jar"]
