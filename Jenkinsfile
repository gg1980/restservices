pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    cd restful-web-bank
                    echo "Multiline shell steps works too"
                    ls -lah
                    mvn compile
                    docker build -t rest-web-bank .
                '''
            }
        }
    }
}
