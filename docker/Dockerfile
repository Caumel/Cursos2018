FROM openjdk:8u171-jdk-alpine

INIT
echo hola
while [ ! -f /var/jar/cursos2018.jar ] ;
do
      sleep 2
done
echo hola

cp /var/jar/cursos2018.jar /var/jar/run/cursos2018.jar
echo hola
rm /var/jar/cursos2018.jar
echo hola
pkill -f 'java -jar'
echo hola
terminal -e java -jar /var/jar/run/cursos2018.jar
echo hola
goto INIT