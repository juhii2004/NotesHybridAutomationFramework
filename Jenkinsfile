pipeline {

    agent any

    tools {

        maven 'Maven'
    }

    stages {

        stage('Checkout Code') {

            steps {

                git branch: 'main',
                    url: 'https://github.com/juhii2004/NotesHybridAutomationFramework.git'
            }
        }

        stage('Clean Project') {

            steps {

                bat 'mvn clean'
            }
        }

        stage('Execute Automation Tests') {

            steps {

                bat 'mvn test'
            }
        }

        stage('Generate Allure Report') {

            steps {

                bat '"C:\\allure-2.39.0\\bin\\allure.bat" generate allure-results --clean -o allure-report'
            }
        }

        stage('Archive Reports') {

            steps {

                archiveArtifacts artifacts: 'allure-report/**',
                        allowEmptyArchive: true

                archiveArtifacts artifacts: 'screenshots/**',
                        allowEmptyArchive: true
            }
        }

        stage('Publish HTML Report') {

            steps {

                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'allure-report',
                    reportFiles: 'index.html',
                    reportName: 'Allure Report'
                ])
            }
        }
    }

    post {

        always {

            echo 'Execution Completed'

            junit allowEmptyResults: true,
                    testResults: 'target/surefire-reports/*.xml'
        }

        success {

            echo 'Build Passed Successfully'
        }

        failure {

            echo 'Build Failed'
        }
    }
}