pipeline{
  agent any
  tools{
    maven 'maven_devops'
  }
  triggers{
    githubPush()
  }
  enviroment{
      POM="playArreglos/pom.xml"
  }
  stages{
    stage('Descarga'){
      steps{
        git url:'https://github.com/abeljunior717/PlayArreglos.git', branch:'main'
      }
    }
    stage ('Compilacion'){
      steps{
        sh 'mvn -f $POM -B'
      }
    }
    stage ('Prueba'){
      steps{
        sh 'mvn -f $POM -B'
      }
      post{
        always{
          junit 'playArreglos/target/surefire-reports/*.xml'
        }
      }
    }
    stage ('Empaquetado'){
      steps{
        archiveArtifacts artifacts: 'playArreglos/target/*.jar',fingerprint:true
      }
    }
  }
}
