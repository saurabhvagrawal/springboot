node{
    stage("preperation"){
            def mvnHome = tool 'm3'
            git 'https://github.com/saurabhvagrawal/springboot.git'
    }
    stage("buid"){
        sh "${mvnHome}/bin/mvn clean install"
        }

    }
    stage("deploy"){

    }