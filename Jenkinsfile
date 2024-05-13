pipeline {
    agent any
    environment {
            // Define a tool named 'Maven' with the installation name 'Maven3'
            MVN_HOME = tool name: 'maven', type: 'maven'
        }
    stages{
         stage('Build maven') {
                steps {
                    // Use the defined Maven and JDK tools
                    sh "${MVN_HOME}/bin/mvn clean package"
                    sh "${MVN_HOME}/bin/mvn clean install"
                }
         }

    }
}
