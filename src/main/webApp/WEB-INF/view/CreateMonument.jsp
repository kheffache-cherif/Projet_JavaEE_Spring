<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Ajouter Monument</title>
</head>
<body>
	<div class="container">
	<div class="card-body">
	<form action="saveMonument" method="post">
		<div class="form-group">
		<label class="control-label">codeM :</label>
		<input type="text" name="codeM" class="form-control"/>
		</div>
		
		<div class="form-group">
		<label class="control-label">nomM :</label>
		<input type="text" name="nomM" class="form-control"/>
		</div>
		
		<div class="form-group">
		<label class="control-label">proprietaire :</label>
		<input type="text" name="proprietaire" class="form-control"/>
		</div>
		
		<div class="form-group">
		<label class="control-label">typeMonument :</label>
		<input type="text" name="typeMonument" class="form-control"/>
		</div>
		<div class="form-group">
		<label class="control-label">longitude :</label>
		<input type="text" name="longitude" class="form-control"/>
		</div>
		<div class="form-group">
		<label class="control-label">latitude :</label>
		<input type="text" name="latitude" class="form-control"/>
		</div>
		<div>
		<button type="submit" class="btn btn-primary">Ajouter</button>
		</div>
	</form>
</div>
${msg}
<br/>
<br/>
<a href="ListeMonuments">Liste Monuments</a>
</div>
</body>
</html>