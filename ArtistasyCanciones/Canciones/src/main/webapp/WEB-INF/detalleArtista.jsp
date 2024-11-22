
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Detalle Artista</title>
</head>
<body>
<h1>Detalle de Artista</h1>
<p>Nombre: ${artista.nombre}</p>
<p>Apellido: ${artista.apellido}</p>
<p>Biografía: ${artista.biografia}</p>
<p>Fecha de Creación: ${artista.fechaCreacion}</p>
<p>Fecha de Actualización: ${artista.fechaActualizacion}</p>

<h2>Canciones del Artista:</h2>
<ul>
    <c:forEach var="cancion" items="${artista.canciones}">
        <li>${cancion.titulo}</li>
    </c:forEach>
</ul>

<a href="/artistas">Volver a la lista de artistas</a>
</body>
</html>