<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Canción</title>
</head>
<body>
<h1>Agregar Canción</h1>
<form action="/canciones/agregar" method="post">
    <label for="titulo">Título:</label>
    <input type="text" id="titulo" name="titulo" required><br>
    
    <label for="artista">Artista:</label>
    <input type="text" id="artista" name="artista" required><br>
    
    <label for="album">Álbum:</label>
    <input type="text" id="album" name="album"><br>
    
    <label for="genero">Género:</label>
    <input type="text" id="genero" name="genero"><br>
    
    <label for="idioma">Idioma:</label>
    <input type="text" id="idioma" name="idioma"><br>
    
    <input type="submit" value="Agregar Canción">
</form>

<a href="/canciones">Volver a la lista de canciones</a>  
</body>
</html>