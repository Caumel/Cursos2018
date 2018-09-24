FROM openjdk:8u171-jdk-alpine

while [ ! -f /var/jar/cursos2018.jar ] ;
do
      sleep 2
done

WORKDIR /var/jar

CMD java -jar cursos2018.jar
CMD rm cursos2018.jar
