package com.sysgears.googledrive

class GoogleDriveController {

	def googleDriveService

	def index() {
		[files: googleDriveService.listFiles()]
	}

	def upload() {
		def file = googleDriveService.uploadFile(params.file)
		googleDriveService.insertPermission(file.getId(), 'reader', 'anyone')
		log.info(file)

		redirect(action: 'index')
	}

	def remove(String id) {
		def file = googleDriveService.remove(id)
		log.info(file)

		redirect(action: 'index')
	}
}
