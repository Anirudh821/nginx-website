def call(String imageName, String imageTag){
    withCredentials([usernamePassword(
        credentialsId: "usermain",
        usernameVariable: "Admin",
        passwordVariable: "Pass"
    )])
    {
        sh "docker login -u ${Admin} -p ${Pass}"
        sh "docker image tag ${imageName}:${imageTag} ${Admin}/${imageName}:${imageTag}"
        sh "docker push ${Admin}/${imageName}:${imageTag}"
    }
}