package com.sysgears.googledrive

import com.google.api.client.http.FileContent
import com.google.api.services.drive.model.File
import org.springframework.web.multipart.MultipartFile

class GoogleDriveService {

	def driveService
	def grailsApplication

	def listFiles() {
		log.error(grailsApplication.config.appBasedir)
		def files = driveService.files().list().execute()
		log.debug(files)

		files.getItems()
	}

	def uploadFile(String title, String description, MultipartFile file) {
		File body = new File()
			.setTitle(title)
			.setDescription(description)
			.setMimeType(file.contentType)


		java.io.File fileContent = new java.io.File("/home/mccloud/document.txt");
		FileContent mediaContent = new FileContent("text/plain", fileContent);
//		def file = driveService.files().insert(body, mediaContent).execute();
//		System.out.println("File ID: " + file.getId());
	}
}
