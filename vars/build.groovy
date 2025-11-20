echo "This is building the code"
                sh "whoami"
                sh "docker build -t note-app:latest ."
