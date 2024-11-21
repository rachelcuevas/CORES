<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <meta charset="UTF-8">  
    <title>Detalles del libro</title>  
</head>  
<body>  

<h1>Detalle del libro</h1>  

<c:if test="${not empty mensaje}">  
    <p>${mensaje}</p>  
</c:if>  

<c:if test="${not empty titulo}">  
    <h2>"${titulo}"</h2>  
    <h3>Autor:</h3>  
    <p>${autor}</p>  
</c:if>  

<c:if test="${empty titulo && empty mensaje}">  
    <p>No se ha encontrado información sobre el libro.</p>  
</c:if>  
<a href="/libros">
<button type="button">Regresar a la lista de libros</button>
</a> 
</body>  
</html>