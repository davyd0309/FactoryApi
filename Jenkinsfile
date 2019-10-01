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
        stage('Build and Publish'){
            steps {
                sh 'gradle build publishToMavenLocal'
            }
        }
    }
}
