#download base image of ubuntu having java8
FROM harisekhon/ubuntu-java
MAINTAINER prashant
COPY . java-codes
RUN mv /java-codes/mysql-connector-java-5.1.42-bin.jar /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/ext/
WORKDIR /java-codes
RUN javac jdbcCodes/MySqlJDBC.java
CMD bash
