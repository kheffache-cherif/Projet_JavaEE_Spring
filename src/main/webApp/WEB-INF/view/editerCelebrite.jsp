<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<accept-charset=utf-8>
<title>Modifier une Celebrite</title>
</head>
<body>

<form action="updateCelebrite" method="post">
<pre>
	numCelebrite : <input type="number" name="numCelebrite" value="${celebrite.numCelebrite}">
	nom : <input type="text" name="nom" value="${celebrite.nom}">
	prenom : <input type="text" name="prenom "value="${celebrite.prenom}">
	nationalite : <input type="text" name="nationalite" value="${celebrite.nationalite}">
	epoque : <input type="text" name="epoque" value="${celebrite.epoque}">



<input type="submit" value="Modifier">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeCelebrites">ListeCelebrites</a>
</body>
</html> 
