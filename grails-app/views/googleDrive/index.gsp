<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
</head>
<body>
<g:each in="${files}" var="file">
	<div class="file">
		<img src="${file.getIconLink()}">
		<a href="${file.getWebContentLink()}">${file.getTitle()}</a>
		<g:link action="remove" id="${file.id}">x</g:link>
	</div>
</g:each>
<g:uploadForm action="upload">
	<g:field type="file" name="file"/>
	<g:submitButton name="submit" value="Upload"/>
</g:uploadForm>
</body>
</html>