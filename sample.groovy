node(){
    stage('Download the git repo')
    {
        git branch: 'main', url: 'https://github.com/arunraju359/jenkins.git'
    }
    stage('Listing the contents')
    {
        sh "ls -ltr"
    }



}