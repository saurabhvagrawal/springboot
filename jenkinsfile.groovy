node{
    stage("preperation"){
            def mvnHome = tool 'm3'
            git 'https://github.com/saurabhvagrawal/springboot.git'
    }
    stage("buid"){
        sh "mvn clean install"
        }
    }
    stage("Checkmarx scan") {
        node {
            step([$class: 'CxScanBuilder', comment: '', credentialsId: '', excludeFolders: '', excludeOpenSourceFolders: '', exclusionsSetting: 'global', failBuildOnNewResults: false, failBuildOnNewSeverity: 'HIGH', filterPattern: '', fullScanCycle: 10, groupId: 'Provide Checkmarx server credentials to see teams list', includeOpenSourceFolders: '', osaArchiveIncludePatterns: '*.zip, *.war, *.ear, *.tgz', osaInstallBeforeScan: false, password: '{AQAAABAAAAAQGi3BvhfECvL+QQuJ5NfgaEHoQP97hOH7RYF8rJx83hI=}', preset: 'Provide Checkmarx server credentials to see presets list', projectName: 'awscodedeploy', sastEnabled: true, serverUrl: '', sourceEncoding: 'Provide Checkmarx server credentials to see source encodings list', username: '', vulnerabilityThresholdResult: 'FAILURE', waitForResultsEnabled: true])

        }
    }