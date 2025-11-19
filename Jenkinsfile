pipeline{
  agent any
  tools{
    maven 'devops_maven'
  }
  triggers{
    githubPush()
  }
  environment{
      POM="playArreglos/pom.xml"
  }
  stages{
    stage('Descarga'){
      steps{
        git url:'https://github.com/abeljunior717/PlayArreglos.git', branch:'main'
      }
    }
    stage('Compilacion'){
      steps{
        sh 'mvn -f $POM -B package'
      }
    }
    stage ('Prueba'){
      steps{
        sh 'mvn -f $POM -B test'
      }
      post{
        always{
          junit 'playArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Empaquetado'){
      steps{
        archiveArtifacts artifacts: 'playArreglos/target/*.jar',fingerprint:true
      }
    }
  }
}
