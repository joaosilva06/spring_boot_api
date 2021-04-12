pipeline{
    agent any
    stages{
        stage ('Compile Stage'){
            steps{
                bat 'mvnw clean install'
            }
        }

        stage ('Deploy to container test'){
            steps{
                bat 'docker build -f Dockerfile -t sp-boot-api .'
                bat 'docker run -p 8085:8085 sp-boot-api'
            }
        }

        stage ('Testing Stage'){
            steps{
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