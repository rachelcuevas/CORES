<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalle de la canción</title>
</head>
<body>
<h1>Detalle de la Canción</h1>  
<% if(request.getAttribute("cancion") != null) { %>  
    <p>Título: ${cancion.titulo}</p>  
    <p>Artista: ${cancion.artista}</p>  
    <p>Álbum: ${cancion.album}</p>  
    <p>Género: ${cancion.genero}</p>  
    <p>Idioma: ${cancion.idioma}</p>  
    <p>Fecha de creación: ${cancion.fechaCreacion}</p>  
    <p>Fecha de actualización: ${cancion.fechaActualizacion}</p>  
<% } else { %>  
    <p>Canción no encontrada.</p>  
<% } %>  
<a href="/canciones">Volver a lista de canciones</a>  
</body>
</html>