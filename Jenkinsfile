pipeline{
    agent any
    stages{
        stage ('Compile Stage'){
            steps{
                git 'https://github.com/joaosilva06/spring_boot_api.git'
                bat './mvnw clean compile'
            }
        }
        stage ('Testing Stage'){
            steps{
                bat './mvnw test'
            }

            post{
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}