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

    options
    {
        buildDiscarder(logRotator(numToKeepStr: '1'))
        disableConcurrentBuilds()
        timeout(time: 60, unit: 'SECONDS')


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
                sh "sleep 45"
            }
        }
        stage('Parallel staging')
        {
            stages
            {
                stage('Parallel : 1')
                {
                    steps{
                        echo "Hi this is stage 1"
                    }
                }
                stage('Parallel : 2')
                {
                    steps{
                        echo "Hi this is stage 2"
                    }
                }
            }
        }
        stage('Two A) : To tell Hi')
        {
            steps{
                echo "Hiiii between the build to verify the sleep"
            }
        }
        stage('Three : Creating and Destroying')
        {
            when 
                {
                    expression {params.TOGGLE}
                }
            steps
            {
                echo "This is to create and Destroy"
                

            }
        }


    }







}
