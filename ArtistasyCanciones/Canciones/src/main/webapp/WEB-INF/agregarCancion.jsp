<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    
    <form:form method="post" action="${pageContext.request.contextPath}/formulario/agregar" modelAttribute="cancion">
        <div>
            <label for="titulo">Título:</label>
            <form:input path="titulo" required />
            <form:errors path="titulo" cssClass="error" />
        </div>
        
        <div>
            <label for="artista">Artista:</label>
            <form:select path="artista.id" required>
                <form:option value="">Seleccione un artista</form:option>
                <c:forEach var="artista" items="${artistas}">
                    <form:option value="${artista.id}">${artista.nombre} ${artista.apellido}</form:option>
                </c:forEach>
            </form:select>
            <form:errors path="artista.id" cssClass="error" />
        </div>
        
        <div>
            <label for="fechaCreacion">Fecha de Creación:</label>
            <form:input path="fechaCreacion" type="date" required />
            <form:errors path="fechaCreacion" cssClass="error" />
        </div>
        
        <div>
            <label for="album">Álbum:</label>
            <form:input path="album" />
            <form:errors path="album" cssClass="error" />
        </div>
        
        <div>
            <label for="genero">Género:</label>
            <form:input path="genero" />
            <form:errors path="genero" cssClass="error" />
        </div>
        
        <div>
            <label for="idioma">Idioma:</label>
            <form:input path="idioma" />
            <form:errors path="idioma" cssClass="error" />
        </div>
        
        <div>
            <input type="submit" value="Agregar Canción" />
        </div>
    </form:form>
    
    <div>
        <a href="${pageContext.request.contextPath}/canciones">Volver a la lista de canciones</a>
    </div>
</body>
</html>