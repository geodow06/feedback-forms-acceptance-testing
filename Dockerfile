FROM maven
COPY pom.xml .
RUN mvn verify --fail-never
COPY . .
RUN mvn clean package
