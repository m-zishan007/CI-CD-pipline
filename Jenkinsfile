pipeline {
    agent any
    environment {
            // Define a tool named 'Maven' with the installation name 'Maven3'
            MVN_HOME = tool name: 'maven', type: 'maven'
        }
    stages{
         stage('Build maven') {
                steps{
                    // Use the defined Maven and JDK tools
                    sh "${MVN_HOME}/bin/mvn clean package"
                    sh "${MVN_HOME}/bin/mvn clean install"
                }
         }
        stage('Build docker image'){
                steps{
                    sh "docker build -t devops-integration ."
                }
        }

        stage('Deploy to K8s') {
               steps {
                     container('kubectl') {
                     sh '''
                     sed -i "s|mzishan007/devops-integration:latest|mzishan007/devops-integration:${BUILD_NUMBER}|" deployment.yaml
                     kubectl apply -f deployment.yaml
                     kubectl rollout status deployment/my-app --timeout=90s
                     '''
                     }
               }
        }
    }
}
