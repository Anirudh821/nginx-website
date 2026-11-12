@Library("Hoi") _
pipeline{
    agent {label "Anirudh"}
    stages{
        stage("build"){
            steps{
                script{
                    build()
                }
            }
        }
        stage("image_build"){
            steps{
                script{
                    image("app","1.0")
                }
            }
        }
        stage("push to docker"){
            steps{
                script{
                    dockerpush("app","1.0")
                }
            }
        }
        stage("deploy"){
            steps{
                sh "docker run -d  --name app-container -p 80:80 app:1.0"
            }
        }

    }
}