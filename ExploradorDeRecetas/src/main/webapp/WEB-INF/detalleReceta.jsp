<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <link rel="stylesheet" href="/css/Styles.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle de Receta</title>
</head>
<body>
<h1>Detalle de la receta</h1>
<c:if test="${not empty mensaje}">
<p>${mensaje}</p>
</c:if>

<c:if test="${not empty nombreReceta}">
<h2>"${nombreReceta}"</h2>
<h3>Ingredientes:</h3>
<ul>
        <c:forEach var="ingrediente" items="${ingredientes}">  
            <li>${ingrediente}</li>   
        </c:forEach>  
    </ul>  
    </c:if>
    
</body>
</html>