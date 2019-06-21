pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('Checkout'){
            steps {
                git 'https://github.com/davyd0309/FactoryApi.git'
            }
        }

        stage('Build'){
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test'){
            steps {
                sh 'mvn test'
            //podac sciezke do testow
            }
        }

        stage('Package'){
            steps {
                sh 'mvn package'
            }
        }
    }
}