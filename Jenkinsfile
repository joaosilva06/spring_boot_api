pipeline{
    agent any
    stages{
        stage ('Compile Stage'){
            steps{
                bat 'mvnw clean compile'
            }
        }
        stage ('Testing Stage'){
            steps{
                bat 'mvnw spring-boot:run'
                bat 'mvnw test'
            }

            post{
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage ('Deploy to container'){
            steps{
                bat 'docker build -f Dockerfile -t sp-boot-api .'
                bat 'docker run -p 8085:8085 sp-boot-api'
            }
        }
    }
}