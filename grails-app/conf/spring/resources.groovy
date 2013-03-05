import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.jackson.JacksonFactory
import com.google.api.services.drive.DriveScopes
import com.sysgears.googledrive.GoogleDriveServiceFactory

// Place your Spring DSL code here
beans = {

	def config = application.config.google.drive

	httpTransport(NetHttpTransport)
	jsonFactory(JacksonFactory)
	factory(GoogleDriveServiceFactory)

	driveService(
			factory: "createDrive",
			httpTransport,
			jsonFactory,
			config.accountId as String,
			DriveScopes.DRIVE,
			config.p12File as String
	)

}
