FROM maven
ENTRYPOINT ["/usr/local/bin/mvn-entrypoint.sh", "test"]
COPY pom.xml .
RUN mvn verify --fail-never
COPY . .
