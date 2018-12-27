@Library('libpipelines@master') _

hose {
    EMAIL = 'cd'
    BUILDTOOL = 'maven'
    BUILDTOOLVERSION = '3.5.0'
    NEW_VERSIONING = 'true'

    DEV = { config ->
        echo 'THIS IS MASTER'
        doCompile(config)
	    doUT(config)
        doIT(config)
        doPackage(config)
	doStaticAnalysis(conf: config, scoverage: true)
        doDeploy(config)
    }
}
