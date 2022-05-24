pipeline{
    agent any
    parameters {
         string(name: 'TIER', defaultValue: 'BRANCHING', description: 'To know the tier usage')
        }
    stages{
        stage ('One: Downloading the code from repo'){
            steps{
                git branch: 'main', url: 'https://github.com/arunraju359/jenkins.git'
            }
        }
        stage ('Two: Listing the contents'){
            steps{
                sh "ls -ltr"
                echo "Hi the corresponding environment is ${params.TIER}"
            }
        }
    }




}