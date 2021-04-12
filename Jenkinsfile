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
    }
}