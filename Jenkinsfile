pipeline {
    agent any
    environment{
        PATH ="C:\Program Files\Maven\apache-maven-3.8.6\bin:$PATH"
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