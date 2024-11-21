<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <meta charset="UTF-8">  
    <title>Lista de Libros</title>  
</head>  
<body>  

<h1>Libros Disponibles</h1>  

<c:if test="${not empty listaLibros}">  
    <ul>  
        <c:forEach var="libro" items="${listaLibros}">  
            <li>  
                <a href="/libros/${libro}">${libro}</a>  
            </li>  
        </c:forEach>  
    </ul>  
</c:if>  

<c:if test="${empty listaLibros}">  
    <p>No hay libros disponibles en la lista.</p>  
</c:if>  

</body>  
</html>   