pipeline
{
    agent 
    {
        label 'java-node'
    }
    stages
    {
        stage( 'One : Download the repo')
        {
            steps
            {
                git branch: 'main', url: 'https://github.com/arunraju359/jenkins.git'
                sh 'ls -ltr'
                sh 'uptime'
                sh 'ifconfig'
            }
            
        }
    }
}