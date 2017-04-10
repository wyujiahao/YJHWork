@echo off
set MAVEN_OPTS=-noverify -javaagent:"jrebel\jrebel.jar" -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000 -Xms256m -Xmx512m -XX:MaxPermSize=512m -Dfile.encoding=UTF-8
call mvn jetty:run