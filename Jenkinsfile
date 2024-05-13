pipeline {
    agent any
    environment {
            // Define a tool named 'Maven' with the installation name 'Maven3'
            MVN_HOME = tool name: 'Maven3', type: 'maven'
            // Define a tool named 'JDK' with the installation name 'Java11'
            JAVA_HOME = tool name: 'Java17', type: 'jdk'
        }
    stages{
         stage('Build') {
                steps {
                    // Use the defined Maven and JDK tools
                    sh "${MVN_HOME}/bin/mvn clean package"
                }
         }
         stage('Test') {
                steps {
                   // Use the defined Java tool
                    sh "${JAVA_HOME}/bin/java -version"
                }
         }
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/m-zishan007/CI-CD-pipline.git']])
                sh "mvn clean install"
            }
        }
    }
}
