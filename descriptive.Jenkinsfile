pipeline{
    agent any
    parameters {
         string(name: 'TIER', defaultValue: 'BRANCHING', description: 'To know the tier usage')
         booleanParam(name: 'DESTROY', defaultValue: false, description: 'To know the boolean')
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
        stage ('Three: To  validate the boolean'){
            when {
                expression {params.DESTROY}
            }
            steps{
                echo "Destroy and Create"

            }
        }
    }




}