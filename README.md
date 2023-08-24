# MAVEN-BUILD-TOOLS


Simple maven app:

Init-project:

    =>mvn archetype:generate -DgroupId=com.imranmadbar -DartifactId=simple-maven-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
    =>mvn install
    =>java -cp ./target/simple-maven-app-1.0-SNAPSHOT.jar com.imranmadbar.App
    

pom.xml

    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
      <modelVersion>4.0.0</modelVersion>
      <groupId>com.imranmadbar</groupId>
      <artifactId>simple-maven-app</artifactId>
      <packaging>jar</packaging>
      
      <version>1.0-SNAPSHOT</version>
      <name>simple-maven-app</name>
      <url>http://maven.apache.org</url>
      
      <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
      </properties>
      
      <dependencies>
        <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>3.8.1</version>
          <scope>test</scope>
        </dependency>
      </dependencies>
      
    </project>

OR Create a executable jar using maven-plugin:

      <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
      <modelVersion>4.0.0</modelVersion>
      <groupId>com.imranmadbar</groupId>
      <artifactId>simple-maven-app</artifactId>
      <packaging>jar</packaging>
      <version>1.0-SNAPSHOT</version>
      <name>simple-maven-app</name>
      <url>http://maven.apache.org</url>
      
      <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
      </properties>
      
      <dependencies>
        <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>3.8.1</version>
          <scope>test</scope>
        </dependency>
      </dependencies>
      
      <build>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.2.0</version>
          <configuration>
            <archive>
              <manifest>
                <mainClass>com.imranmadbar.App</mainClass>
              </manifest>
            </archive>
          </configuration>
        </plugin>
      </plugins>
    </build>
    
    </project>


Now run:

     =>mvn clean && mvn install
     =>java -jar ./target/simple-maven-app-1.0-SNAPSHOT.jar


