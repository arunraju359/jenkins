pipeline
{
    agent any
    stages
    {
        stage('One : Download the repo')
        {
            steps
            {
                 git branch: 'main', url: 'https://github.com/arunraju359/jenkins.git'
            }
        }
        stage('Two : Listing the contents')
        {
            steps
            {
                sh "ls -ltr"
            }
        }


    }







}
