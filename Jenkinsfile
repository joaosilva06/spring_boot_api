pipeline{
    agent any
    stages{
        stage ('Compile Stage'){
            steps{
                bat 'mvnw clean package -DskipTests=true'
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
        stage ('Deploy to container test'){
            steps{
                bat 'docker build -f Dockerfile -t sp-boot-api .'
            }
        }
    }
}