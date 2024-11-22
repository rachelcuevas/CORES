<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Agregar Artista</title>
</head>
<body>
<h1>Agregar Artista</h1>

<c:if test="${not empty param.error}">
    <div style="color: red;">${param.error}</div>
</c:if>

<form action="/artistas/procesa/agregar" method="post">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required>
    
    <label for="apellido">Apellido:</label>
    <input type="text" id="apellido" name="apellido" required>
    
    <label for="biografia">Biografía:</label>
    <textarea id="biografia" name="biografia"></textarea>
    
    <input type="submit" value="Agregar Artista">
</form>

<a href="/artistas">Volver a la lista de artistas</a>
</body>
</html>