<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Artistas</title>
</head>
<body>
<h1>Lista de Artistas</h1>
<table>
    <tr>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Acciones</th>
    </tr>
    <c:forEach var="artista" items="${artistas}">
        <tr>
            <td>${artista.nombre}</td>
            <td>${artista.apellido}</td>
            <td><a href="/artistas/detalle/${artista.id}">Ver Detalle</a></td>
        </tr>
    </c:forEach>
</table>
<a href="/artistas/formulario/agregar">Agregar Artista</a>
<a href="/canciones">Ir a canciones</a> <!-- Enlace a canciones -->
</body>
</html>