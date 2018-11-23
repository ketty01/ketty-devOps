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
				junit '**/build/test_results/test/*.xml'
			}
		}
		stage('Publish'){
			steps{
				echo 'Publishing Artifact'
				sh './gradlew uploadArchives -p quickstart'
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
				junit '**/reports/tests/test/*.hml'
			}
		}
		stage('Security_webapplication'){
			steps{
				sh './webapplication/gradlew sonarqube'
				sh './webapplication/gradlew dependencyCheckAnalyze'
				archiveArtifacts artifacts: '**/repos/*.war'
			}
		}
	}
}