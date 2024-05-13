pipeline {
    agent any
    environment {
            // Define a tool named 'Maven' with the installation name 'Maven3'
            MVN_HOME = tool name: 'Maven3', type: 'maven'
            // Define a tool named 'JDK' with the installation name 'Java11'
           // JAVA_HOME = tool name: 'Java11', type: 'jdk'
        }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/m-zishan007/CI-CD-pipline']])
                sh "mvn clean install"
            }
        }
    }
}