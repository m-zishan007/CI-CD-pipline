pipeline {
    agent any
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/m-zishan007/CI-CD-pipline']])
                sh 'mvn clean install'
            }
        }
    }
}