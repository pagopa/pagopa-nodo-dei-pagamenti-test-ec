#FROM toolbox.sia.eu/docker/openjdk:8-jdk-alpine
FROM openjdk:8-jdk-alpine
ENV http_proxy=http://csproxy:8080
ENV https_proxy=http://csproxy:8080
ENV no_proxy=toolbox.sia.eu

ADD ./target /tmp/target
ADD log4j2.xml /tmp/target/log4j2.xml
ADD PA_List.dat /tmp/target/PA_List.dat
ADD TS_Config.conf /tmp/target/TS_Config.conf
ADD rpt.xml /tmp/target/rpt.xml
ADD apm.conf /tmp/target/apm.conf
ADD elastic-apm-agent-1.26.0.jar /tmp/target/elastic-apm-agent-1.26.0.jar
ADD startPAMock.sh /tmp/target/startPAMock.sh
ADD src/main/resources /tmp/target

WORKDIR /tmp/target

RUN chmod 777 startPAMock.sh
RUN mkdir logs
RUN chmod 777 logs

EXPOSE 8484

ENTRYPOINT ["/bin/sh", "./startPAMock.sh"]