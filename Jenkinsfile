pipeline{
	agent any
 	stages{
		stage('Build'){
			steps{
				echo 'Building'
				sh './quickstart/gradlew clean assemble -p quickstart'
			}
		}
		stage('Testing'){
			steps{
				echo 'Runnig unit test'
				sh './quickstart/gradlew test -p quickstart'
				junit '**/test-results/test/*.xml'
			}
		}
		stage('Publish'){
			steps{
				echo 'Publishing Artifact'
				sh './quickstart/gradlew uploadArchives -p quickstart'
				archiveArtifacts artifacts: '**/repos/*.jar'
			}
		}
		stage('Build_webapplication'){
			steps{
				sh './webapplication/gradlew clean assemble -p webapplication'
				sh './webapplication/gradlew uploadArchives -p webapplication'
				archiveArtifacts artifacts: '**/repos/*.war'
			}
		}
		stage('Testing_webapplication'){
			steps{
				sh './webapplication/gradlew test -p webapplication'
				junit '**/test-results/test/*.xml'
				archiveArtifacts artifacts: '**/reports/tests/test/*.html'
			}
		}
		stage('Security_webapplication'){
			steps{
				sh './webapplication/gradlew sonarqube -p webapplication'
				sh './webapplication/gradlew dependencyCheckAnalyze -p webapplication'
				archiveArtifacts artifacts: '**/repos/*.html'
			}
		}
		stage('Deploy_webapplication'){
      steps{
      	sh './webapplication/gradlew -b deploy.gradle copyWar -b webapplication'
      }
    }
	}
}
