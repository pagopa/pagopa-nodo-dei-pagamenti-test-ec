FROM openjdk:8-jdk-alpine
#FROM toolbox.sia.eu/docker/openjdk:8-jdk-alpine

#ENV http_proxy=http://csproxy:8080
#ENV https_proxy=http://csproxy:8080
#ENV no_proxy=toolbox.sia.eu

#FROM maven:3.6.0-jdk-11-slim
#ADD pom.xml /tmp/
#ADD src /tmp/src/
ADD log4j2.xml /tmp/log4j2.xml
ADD PA_List.dat /tmp/PA_List.dat
ADD TS_Config.conf /tmp/TS_Config.conf
ADD rpt.xml /tmp/rpt.xml
ADD apm.conf /tmp/apm.conf
ADD elastic-apm-agent-1.26.0.jar /tmp/elastic-apm-agent-1.26.0.jar
ADD startPAMock.sh /tmp/startPAMock.sh
ADD ./target /tmp/target
#ADD ./target/PA_Mock-1.1.1.jar /tmp/PA_Mock-1.1.1.jar

WORKDIR /tmp/target

RUN chmod 777 startPAMock.sh

EXPOSE 8484

ENTRYPOINT ["/bin/sh", "./startPAMock.sh"]