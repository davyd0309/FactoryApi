//pipeline {
//    agent any
//    stages {
//        stage('Checkout'){
//            steps {
//                git 'https://github.com/davyd0309/FactoryApi.git'
//            }
//        }
//
//        stage('Compile'){
//            agent {docker 'maven:3.5-alpine'}
//            steps {
//                sh 'mvn clean compile'
//            }
//        }
//
//        stage('Unit tests'){
//            agent {docker 'maven:3.5-alpine'}
//            steps {
//                //uruchomienie testow unit
//            }
//        }
//
//
//        stage('Integration tests'){
//            agent {docker 'maven:3.5-alpine'}
//            steps {
//                //uruchomienie testow integra
//            }
//        }
//
//        stage('Build'){
//            agent {docker 'maven:3.5-alpine'}
//            steps {
//                sh 'mvn clean package'
//                //zapisanie paczki
//            }
//        }
//
//        stage('Add to Artifactory'){
//            agent {docker 'maven:3.5-alpine'}
//            steps {
//            //dodanie do JFrog
//            }
//        }
//
//
//        stage('Create Docker image'){
//            agent {docker 'maven:3.5-alpine'}
//            steps {
//                //deploy on Heroku
//            }
//        }
//
//        stage('Deploy'){
//            agent {docker 'maven:3.5-alpine'}
//            steps {
//               //deploy on Heroku
//            }
//        }
//    }
//}

pipeline {
    agent any
    tools {
        gradle "Gradle"
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/davyd0309/FactoryApi.git'
            }
        }
        stage('Build'){
            steps {
                sh 'gradle build'
            }
        }
    }
}
