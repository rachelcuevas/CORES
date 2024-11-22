<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista de Canciones</title>
</head>
<body>
    <h2>Lista de Canciones</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Título</th>
            <th>Artista</th>
            <th>Álbum</th>
            <th>Género</th>
            <th>Idioma</th>
            <th>Acciones</th>
        </tr>
        <c:forEach var="cancion" items="${canciones}">
            <tr>
                <td>${cancion.id}</td>
                <td>${cancion.titulo}</td>
                <td>${cancion.artista}</td>
                <td>${cancion.album}</td>
                <td>${cancion.genero}</td>
                <td>${cancion.idioma}</td>
               
            </tr>
        </c:forEach>
    </table>
    <div>
        <a href="/canciones/formulario/agregar">
            <button type="button">Agregar Canción</button>
        </a>
    </div>
</body>
</html>
