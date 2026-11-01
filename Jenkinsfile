
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out project'
                checkout scm
            }
        }

        stage('Verify Java') {
            steps {
                bat 'java -version'
            }
        }

        stage('Verify Maven') {
            steps {
                bat 'mvn -version'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
