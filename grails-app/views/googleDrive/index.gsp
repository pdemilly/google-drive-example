<%@ page contentType="text/html;charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/html">
<head>
	<title>Google Drive</title>
	<meta content="main" name="layout">
	<link rel="stylesheet" type="text/css" href="/css/index.css">
</head>

<body>
<div id="page-body" role="main">
	<h1>Welcome to Google Drive</h1>

	<p>Feel free to test Google Drive uploads and downloads.</p>

	<h2>You need to do these steps to gain access:</h2>
	<ol>
		<li>Go to <g:link url="https://code.google.com/apis/console/">google api</g:link> page.</li>
		<li>Enabli drive api and drive sdk access</li>
		<li>Create your service application and obtain private key</li>
		<li>Provide your private key in Config.groovy "google.drive.accountId" (application email address) and
		"google.drive.p12File" path to your private key, can be relative (e.g. web-app/WEB-INF/myprivatekey.p12)</li>
		<li>Now you're done! Enjoy!</li>
	</ol>

	<div id="file-container">
		<ul>
		<g:each in="${files}" var="file">
			<li class="file">
				<img src="${file.getIconLink()}">
				<a href="${file.getWebContentLink()}">${file.getTitle()}</a>

				<g:link action="remove" id="${file.id}">&times;</g:link>
			</li>
		</g:each>
		</ul>
	</div>

	<div id="form-container">
		<g:uploadForm name="upload" action="upload">
			<g:field type="file" name="file"/>
			<g:submitButton name="submit" value="Upload"/>
		</g:uploadForm>
	</div>
</div>
</div>
</body>
</html>