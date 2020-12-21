<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<accept-charset=utf-8>
<title>Créer Celebrite</title>
</head>
<body>

<form action="saveCelebrite" method="post">
<pre>
	numCelebrite : <input type="number" name="numCelebrite">
	nom : <input type="text" name="nom">
	prenom : <input type="text" name="prenom">
	nationalite : <input type="text" name="nationalite">
	epoque : <input type="text" name="epoque">



<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeCelebrite">ListeCelebrites</a>
</body>
</html> 