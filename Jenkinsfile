pipeline {
    agent any
    environment {
            // Define a tool named 'Maven' with the installation name 'Maven3'
            MVN_HOME = tool name: 'maven', type: 'maven'
        }
    stages{
         stage('Build') {
                steps {
                    // Use the defined Maven and JDK tools
                    sh "${MVN_HOME}/bin/mvn clean package"
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
