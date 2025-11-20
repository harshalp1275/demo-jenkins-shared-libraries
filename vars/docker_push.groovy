echo "pushing the image to docker hub"
                withCredentials([usernamePassword(credentialsId: 'dockerHubCred', 
                                usernameVariable: 'dockerHubUser', 
                                passwordVariable: 'dockerHubPass')]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker image tag note-app:latest ${env.dockerHubUser}/note-app:latest"
                sh "docker push ${env.dockerHubUser}/note-app:latest"
