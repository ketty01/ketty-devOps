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
				sh './gradlew uploadArchives -p quickstart'
				archiveArtifacts artifacts: '**/repos/*.jar'
			}
		}
	}
}