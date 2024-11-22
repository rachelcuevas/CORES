<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Agregar Canción</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <h2>Agregar Canción</h2>
    
    <form:form method="post" action="/canciones/procesa/agregar" modelAttribute="cancion">
<div>
    <label for="fechaCreacion">Fecha de Creación:</label>
    <input type="date" id="fechaCreacion" name="fechaCreacion" required />
    <form:errors path="fechaCreacion" cssClass="error" />
</div>
        
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
            <input type="submit" value="Agregar Canción" />
        </div>
    </form:form>
    
    <div>
        <a href="/canciones">Volver a la lista de canciones</a>
    </div>
</body>
</html>