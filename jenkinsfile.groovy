node{
    stage("preperation"){
            def mvnHome = tool 'm3'
            git 'https://github.com/saurabhvagrawal/springboot.git'
    }
    stage("buid"){
        sh "mvn clean install"
        }

    }
    stage("deploy"){

    }