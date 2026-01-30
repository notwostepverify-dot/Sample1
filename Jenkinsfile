pipeline {
    agent any
    tools { maven 'Maven 3.x' } // Ensure Maven is configured in Jenkins Global Tool Configuration
    stages {
        stage('Checkout') {
            steps { checkout scm }
        }
        stage('Build') {
            steps { sh 'mvn clean compile' }
        }
        stage('Test') {
            steps { sh 'mvn test' }
        }
        stage('Package') {
            steps { sh 'mvn package' }
        }
    }
}

