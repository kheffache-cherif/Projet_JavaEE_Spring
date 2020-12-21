<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Celebrite</title>
</head>
<body>
<div class="container">
<div class="card">
  <div class="card-header">
    Liste des Celebrite
  </div>
  <div class="card-body">
       
      <table class="table table-striped">
        <tr>
          <th>numCelebrite</th><th>Nom </th><th>prenom</th><th>nationalité</th><th>epoque
          </th><th>Suppression<th>Edition</th>
         </tr>
         <c:forEach items="${celebrites}" var="c">
           <tr>
              <td>${c.numCelebrite }</td>
              <td>${c.nom }</td>
              <td>${c.prenom }</td>
              <td>${c.nationalite}</td>
              <td>${c.epoque}</td>
             
              <td><a onclick="return confirm('Etes-vous sûr ?')" href="supprimerCelebrite?id=${c.numCelebrite }">Supprimer</a></td>
               <td><a href="modifierCelebrite?id=${c.numCelebrite }">Edit</a></td>
           </tr>
         </c:forEach>        
      </table>
  </div>
</div>
</div>
</body>
</html>