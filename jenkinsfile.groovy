node{
    stage("preperation"){
        steps {
            def mvnHome = tool 'm3'
            git 'https://github.com/saurabhvagrawal/springboot.git'
        }
    }
    stage("buid"){
        sh "cd springboot"
        sh "${mvnHome}/bin/mvn clean install"
        }

    }
    stage("deploy"){

    }