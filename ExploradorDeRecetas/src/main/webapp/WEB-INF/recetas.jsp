<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<link rel="stylesheet" href="/css/Styles.css">
<!DOCTYPE html>  
<html>  
<head>  
    <title>Ejemplo de forEach</title>  
</head>  
<body>  
    <h1>Lista de Recetas</h1>  
    <ul>  
        <c:forEach var="receta" items="${listaRecetas}">  
            <li>${receta}</li>   
        </c:forEach>  
    </ul>  
</body>  
</html>