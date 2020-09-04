#基于openjdk:8
FROM openjdk:8

ADD  springboot-jenkins-0.0.1-SNAPSHOT.jar /springboot-jenkins.jar

# 指定当前操作目录
WORKDIR /var/jenkins_home/service

ADD  springboot-jenkins-0.0.1-SNAPSHOT.jar /springboot-jenkins.jar
RUN bash -c 'touch /springboot-jenkins'
ENTRYPOINT ["java","-Djava.security.egd-file:/dev/./urandom","-jar","-Xmx1024m","-Xms1024m","/springboot-jenkins.jar"]
