pipeline
{
    agent any
    stages
    {
        stage( 'One : Download the repo')
        {
            steps
            {
                git branch: 'main', url: 'https://github.com/arunraju359/jenkins.git'
                sh 'ls -ltr'
            }
            
        }
    }
}