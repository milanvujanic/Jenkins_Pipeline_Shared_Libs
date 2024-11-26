def call(Map config) {
    node {
      echo "${config.message}"
      sh '''
        git version
        java -version
        export MAVEN_HOME=/opt/apache-maven-3.9.8
        export PATH=${PATH}:${JAVA_HOME}/bin:${MAVEN_HOME}/bin
        mvn -version
      '''
    }
}