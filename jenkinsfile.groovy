node{
    stage("preperation"){
            def mvnHome = tool 'm3'
            sh "rm"
            git 'https://github.com/saurabhvagrawal/springboot.git'
    }
    stage("buid"){
        sh "${mvnHome}/bin/mvn clean install"
        }

    }
    stage("deploy"){

    }