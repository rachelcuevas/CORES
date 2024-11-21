<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Libros</title>
</head>
<body>
<h1>Agregar un nuevo libro</h1>
<form action="/procesa/libro" method="post">
<label for="titulo">Título:</label>
<input type="text" id="titulo" name="titulo" required><br>

<label for="autor">Autor:</label>
<input type="text" id="autor" name="autor" required><br>
<br>
<input type="submit" value="Guardar">
</form>
<br>
<br>
<a href="/libros">
<button type="button">Regresar a la lista de libros</button>
</a> 
</body>
</html>