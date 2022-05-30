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
                sh 'ls -ltr'
            }
            
        }
        stage('Two : validate the code')
        {
            steps{
                sh 'mvn validate'
            }
        }
        stage('Three : compile the code')
        {
            steps{
                sh 'mvn compile'
            }
        }
        stage('Four : Artifact generation')
        {
            steps{
                sh 'mvn package'
            }
        }
    }
}