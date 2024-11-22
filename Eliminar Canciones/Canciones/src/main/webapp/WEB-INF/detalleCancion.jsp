<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle de la Canción</title>
</head>
<body>
    <h1>Detalle de la Canción</h1>
    
    <c:if test="${not empty cancion}">
        <p>Título: ${cancion.titulo}</p>
        <p>Artista: ${cancion.artista}</p>
        <p>Álbum: ${cancion.album}</p>
        <p>Género: ${cancion.genero}</p>
        <p>Idioma: ${cancion.idioma}</p>
        <p>Fecha de creación: ${cancion.fechaCreacion}</p>
        <p>Fecha de actualización: ${cancion.fechaActualizacion}</p>
        
        <form action="/canciones/eliminar/${cancion.id}" method="post" style="display:inline;">
            <input type="submit" value="Eliminar Canción" onclick="return confirm('¿Estás seguro de que deseas eliminar esta canción?');" />
        </form>
    </c:if>

    <c:if test="${empty cancion}">
        <p>Canción no encontrada.</p>
    </c:if>

    <a href="/canciones">Volver a la lista de canciones</a>
</body>
</html>