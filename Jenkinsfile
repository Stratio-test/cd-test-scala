@Library('libpipelines@master') _

hose {
    EMAIL = 'cd'
    BUILDTOOL = 'maven'
    BUILDTOOLVERSION = '3.5.0'
    NEW_VERSIONING = 'true'

    DEV = { config ->
        echo 'THIS IS MASTER'
        doCompile(config)
	doUT(conf: config, scoverage: true)
        doIT(conf: config, scoverage: true)
        doPackage(config)
	doStaticAnalysis(conf: config, scoverage: true)
        doDeploy(config)
    }
}
