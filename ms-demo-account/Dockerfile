#FROM openjdk:15-alpine
#MAINTAINER  Agil Isayev <isayevagil@gmail.com>
#COPY ./build/libs/ms-11-0.0.1.jar  ms-11-0.0.1.jar
#ADD build/libs/ms-11-0.0.1.jar  ms-11-0.0.1.jar
#LABEL vendorl = "skills Application"
#ENTRYPOINT ["java","-jar","ms-11-0.0.1.jar"]

#FROM alpine:3.11.2
FROM openjdk:15-alpine
COPY ./build/libs/ms-demo-account-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app/
#  ---- build
ENTRYPOINT ["java"]
CMD ["-jar", "/app/ms-demo-account-0.0.1-SNAPSHOT.jar"]

#CMD ["java","-jar", "/app/ms-11-0.1.jar"]
#CMD ["java","-jar"]


#Run command:  Run  from cpoy image build zaman isleyir
#ENTRYPOINT CMD  bun start zamani ise dusur.
# command ile ENTRYPOINT arasindaki ferqi nedir.
