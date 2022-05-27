pipeline
{
    agent any
    parameters
    {
        string(name: 'ENVIRONMENT', defaultValue: 'Development', description: 'This pipeline project is to check the pipeline flow thru DSL')
        text(name: 'MyText', defaultValue: '', description: '')
        booleanParam(name: 'TOGGLE', defaultValue: false, description: 'Toggle this value')
        choice(name: 'JDK_VERSION', choices: ['One', 'Two', 'Three'], description: 'Pick something')





    }
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
                echo "the parameter that is passed is ${params.ENVIRONMENT}"
                echo "the text is \n ${params.MyText}"
                echo "the choice chosen is ${params.JDK_VERSION}"
            }
        }


    }







}
