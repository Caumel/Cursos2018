FROM openjdk:8u171-jdk-alpine

while [ ! -f /var/jar/cursos2018.jar ] ;
do
      sleep 2
done

WORKDIR /var/jar

nohup java -jar $PATH_TO_JAR > myservice.log  2>&1 &

ENTRYPOINT ["java", "-jar", "cursos2018.jar"]
rm cursos2018.jar