CREATE DATABASE Clientesypedidos;  

USE Clientesypedidos;  

CREATE TABLE clientes(  
    id INT AUTO_INCREMENT PRIMARY KEY,  
    nombre VARCHAR(30) UNIQUE NOT NULL,  
    direccion TEXT NOT NULL,  
    telefono INT  
);  

CREATE TABLE pedidos(  
    id INT AUTO_INCREMENT PRIMARY KEY,  
    cliente_id INT,  
    fecha DATE,  
    total FLOAT (10,2),  
    FOREIGN KEY(cliente_id) REFERENCES clientes(id)  
);  

INSERT INTO clientes (id, nombre, direccion, telefono) VALUES (01, 'Mariana', 'Lynch103', 12345);  
INSERT INTO clientes (id, nombre, direccion, telefono) VALUES (02, 'Simon', 'Anguita1205', 23456);  
INSERT INTO clientes (id, nombre, direccion, telefono) VALUES (03, 'Julian', 'Valdivia304', 34567);  
INSERT INTO clientes (id, nombre, direccion, telefono) VALUES (04, 'Cristian', 'Colon942', 45678);  
INSERT INTO clientes (id, nombre, direccion, telefono) VALUES (05, 'Lorena', 'Colon103', 56789);  

INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (14, 01, '2024-02-25', 1997.00);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (15, 01, '2024-04-25', 55.99);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (16, 02, '2023-10-15', 60.99);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (17, 02, '2024-12-15', 90.99);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (18, 03, '2024-06-12', 10.99);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (19, 03, '2024-01-29', 30.50);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (20, 04, '2024-11-20', 15.50);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (21, 04, '2024-10-17', 35.50);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (23, 05, '2024-07-23', 45.80);  
INSERT INTO pedidos (id, cliente_id, fecha, total) VALUES (24, 05, '2024-09-16', 50.50);

SELECT   
    c.id AS cliente_id,  
    c.nombre AS cliente_nombre,  
    c.direccion AS cliente_direccion,  
    c.telefono AS cliente_telefono,  
    p.id AS pedido_id,  
    p.fecha AS pedido_fecha,  
    p.total AS pedido_total  
FROM   
    clientes c  
LEFT JOIN   
    pedidos p ON c.id = p.cliente_id;  
    
    SELECT   
    c.id AS cliente_id,  
    c.nombre AS cliente_nombre,  
    SUM(p.total) AS total_pedidos  
FROM   
    clientes c  
LEFT JOIN   
    pedidos p ON c.id = p.cliente_id  
GROUP BY   
    c.id, c.nombre;
    
    -- Supongamos que el cliente que deseas eliminar tiene un id específico, por ejemplo, 1.  
SET @cliente_id = 1;  

  
DELETE FROM pedidos WHERE cliente_id = @cliente_id;  
DELETE FROM clientes WHERE id = @cliente_id;

SELECT   
    c.id AS cliente_id,  
    c.nombre AS cliente_nombre,  
    COUNT(p.id) AS numero_pedidos  
FROM   
    clientes c  
LEFT JOIN   
    pedidos p ON c.id = p.cliente_id  
GROUP BY   
    c.id, c.nombre  
ORDER BY   
    numero_pedidos DESC;
    
    