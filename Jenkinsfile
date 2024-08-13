pipeline{
    agent any
    environment {
        PATH = "C:/Users/e039325/Downloads/apache-maven-3.9.8-bin/apache-maven-3.9.8/bin;${env.PATH}"
    }
    stages {
        stage('Checkout') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/NandanVasistaBH/mavenJenkinsDocker.git']]
                ])

            }
        }
        stage("test"){
            steps{
                bat "mvn test"
            }
        }
    }
}