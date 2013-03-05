package com.sysgears.googledrive

class GoogleDriveController {

	def googleDriveService

	def index() {
		[fileNames: googleDriveService.listFiles().originalFilename]
	}
}
