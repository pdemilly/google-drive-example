grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {

	inherits("global") {

	}

	log "error"
	checksums true // Whether to verify checksums on resolve

	repositories {
		inherits true // Whether to inherit repository definitions from plugins

		grailsPlugins()
		grailsHome()
		grailsCentral()

		mavenLocal()
		mavenCentral()

		mavenRepo 'http://google-api-client-libraries.appspot.com/mavenrepo'
	}
	dependencies {
//		runtime 'mysql:mysql-connector-java:5.1.20'
		runtime 'com.google.http-client:google-http-client-jackson:1.12.0-beta'
		runtime 'com.google.api-client:google-api-client:1.12.0-beta'
		runtime 'com.google.apis:google-api-services-drive:v2-rev30-1.12.0-beta'
	}

	plugins {
		runtime ":hibernate:$grailsVersion"
		runtime ":jquery:1.8.0"
		runtime ":resources:1.1.6"

		build ":tomcat:$grailsVersion"

		compile ':cache:1.0.0'
	}
}
