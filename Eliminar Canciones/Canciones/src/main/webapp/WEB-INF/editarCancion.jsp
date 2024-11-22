<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Editar Canción</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <h2>Editar Canción</h2>
    <form:form modelAttribute="cancion" action="/canciones/procesa/editar/${cancion.id}" method="post">
        <div>
            <label>Título:</label>
            <form:input path="titulo" />
            <form:errors path="titulo" cssClass="error" />
        </div>
        <div>
            <label>Artista:</label>
            <form:input path="artista" />
            <form:errors path="artista" cssClass="error" />
        </div>
        <div>
            <label>Álbum:</label>
            <form:input path="album" />
            <form:errors path="album" cssClass="error" />
        </div>
        <div>
            <label>Género:</label>
            <form:input path="genero" />
            <form:errors path="genero" cssClass="error" />
        </div>
        <div>
            <label>Idioma:</label>
            <form:input path="idioma" />
            <form:errors path="idioma" cssClass="error" />
        </div>
        <div>
            <input type="submit" value="Actualizar Canción" />
        </div>
    </form:form>
    
    <div>
        <a href="/canciones">Volver a lista de canciones</a>
    </div>
</body>
</html>