<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
	<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier une Celebrite</title>
</head>
<body>
<div class="card-body">
<form action="updateCelebrite" method="post">
   <div class="form-group">
      <label class="control-label">Num_Celebrité :</label>
       <input type="number" name="numCelebrite" value="${celebrite.numCelebrite}" readonly class="form-control"/>
    </div>	
   <div class="form-group">
      <label class="control-label">Nom celebrité :</label>
       <input type="text" name="nom" value="${celebrite.nom}" class="form-control"/>
    </div>
    <div class="form-group">
      <label class="control-label">Prenom celebrité :</label>
       <input type="text" name="prenom" value="${celebrite.prenom}" class="form-control"/>
    </div>
    <div class="form-group">
      <label class="control-label">Nationalite celebrité :</label>
       <input type="text" name="nationalite" value="${celebrite.nationalite}" class="form-control"/>
    </div>	
     <div class="form-group">
      <label class="control-label">Epoque Celebrité :</label>
       <input type="text" name="epoque" value="${celebrite.epoque}" class="form-control"/>
    </div>		
    <div>
 		  <button type="submit" class="btn btn-primary">Modifier</button>
 	</div>
</form>
</div>
<br/>
<br/>
<a href="ListeCelebrites">Liste celebrites</a>
</body>
</html>