pipeline {
    agent any
    stages {
        stage('Checkout'){
            steps {
                git 'https://github.com/davyd0309/FactoryApi.git'
            }
        }

        stage('Compile'){
            agent {docker 'maven:3.5-alpine'}
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test'){
            agent {docker 'maven:3.5-alpine'}
            steps {
                sh 'mvn test'
            //podac sciezke do testow
            }
        }

        stage('Package'){
            agent {docker 'maven:3.5-alpine'}
            steps {
                sh 'mvn package'
            }
        }
    }
}