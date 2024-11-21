INSERT INTO estudiantes (nombre, edad) VALUES   
('Ana Pérez', 22),  
('Luis González', 25),  
('Marta López', 20),  
('Javier Ortega', 23),  
('Claudia Reyes', 24);  

INSERT INTO cursos (nombre, duracion) VALUES   
('Matemáticas', 30),  
('Historia', 45),  
('Ciencias', 40),  
('Literatura', 35);  

INSERT INTO inscripciones (id_estudiante, id_curso) VALUES  
(1, 1), -- Ana está inscrita en Matemáticas  
(1, 2), -- Ana está inscrita en Historia  
(2, 1), -- Luis está inscrito en Matemáticas  
(2, 3), -- Luis está inscrito en Ciencias  
(3, 2), -- Marta está inscrita en Historia  
(3, 4), -- Marta está inscrita en Literatura  
(4, 1), -- Javier está inscrito en Matemáticas  
(5, 3); -- Claudia está inscrita en Ciencias


SELECT e.nombre AS estudiante, c.nombre AS curso  
FROM estudiantes e  
JOIN inscripciones i ON e.id = i.id_estudiante  
JOIN cursos c ON i.id_curso = c.id;


SELECT e.nombre  
FROM estudiantes e  
JOIN inscripciones i ON e.id = i.id_estudiante  
JOIN cursos c ON i.id_curso = c.id  
WHERE c.nombre = 'Matemáticas';  

SELECT c.nombre  
FROM cursos c  
JOIN inscripciones i ON c.id = i.id_curso  
JOIN estudiantes e ON i.id_estudiante = e.id  
WHERE e.nombre = 'Ana Pérez';  

SELECT c.nombre AS curso, COUNT(i.id_estudiante) AS num_estudiantes  
FROM cursos c  
LEFT JOIN inscripciones i ON c.id = i.id_curso  
GROUP BY c.nombre;

SELECT e.nombre  
FROM estudiantes e  
LEFT JOIN inscripciones i ON e.id = i.id_estudiante  
WHERE i.id_estudiante IS NULL;