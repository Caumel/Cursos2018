FROM openjdk:8u171-jdk-alpine

while [ ! -f /var/jar/cursos2018.jar ] ;
do
      sleep 2
done

WORKDIR /var/jar


ENTRYPOINT ["java", "-jar", "cursos2018.jar"]
