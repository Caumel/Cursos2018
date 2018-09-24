FROM openjdk:8u171-jdk-alpine

INIT

while [ ! -f /var/jar/cursos2018.jar ] ;
do
      sleep 2
done

cp /var/jar/cursos2018.jar /var/jar/run/cursos2018.jar
rm /var/jar/cursos2018.jar

pkill -f 'java -jar'

terminal -e java -jar /var/jar/run/cursos2018.jar

goto INIT