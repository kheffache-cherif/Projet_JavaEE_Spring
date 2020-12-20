<%@ page language="java" contentType="text/html; charset=windows-1256"pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Créer une Celebrite </title>
</head>
<body>
<form action="saveCelebrite" method="post">
<pre>
nationalite : <input type="text" name="nationalite">
Epoque : <input type="text" name="epoque">
nom : <input type="text" name="nom">
prenom : <input type="text" name="prenom">

<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeProduits">Liste Des Celebrites</a>
</body>
</html> 