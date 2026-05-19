INSERT INTO CIUDAD (NOMBRE) VALUES
('Bogotá'),
('Medellín'),
('Cali'),
('Barranquilla'),
('Cartagena');

INSERT INTO USUARIO (ID_USUARIO, NOMBRE, NUM_TELEFONO) VALUES
('U1', 'Carlos Perez', '3001111111'),
('U2', 'Laura Gomez', '3002222222'),
('U3', 'Andres Ruiz', '3003333333'),
('U4', 'Sofia Martinez', '3004444444'),
('U5', 'Juan Torres', '3005555555');

INSERT INTO CLIENTE (ID_CLIENTE, ID_USUARIO, CORREO) VALUES
('C1', 'U1', 'cliente1@mail.com'),
('C2', 'U2', 'cliente2@mail.com'),
('C3', 'U3', 'cliente3@mail.com'),
('C4', 'U4', 'cliente4@mail.com'),
('C5', 'U5', 'cliente5@mail.com');

INSERT INTO EMPLEADO (ID_EMPLEADO, ID_USUARIO, USER_NAME) VALUES
('E1', 'U1', 'empleado1'),
('E2', 'U2', 'empleado2'),
('E3', 'U3', 'empleado3'),
('E4', 'U4', 'empleado4'),
('E5', 'U5', 'empleado5');

INSERT INTO PROVEEDOR (ID_PROVEEDOR, ID_USUARIO, CORREO, DIRECCION, ID_CIUDAD) VALUES
('P1', 'U1', 'prov1@mail.com', 'Calle 1', 1),
('P2', 'U2', 'prov2@mail.com', 'Calle 2', 2),
('P3', 'U3', 'prov3@mail.com', 'Calle 3', 3),
('P4', 'U4', 'prov4@mail.com', 'Calle 4', 4),
('P5', 'U5', 'prov5@mail.com', 'Calle 5', 5);

INSERT INTO CATEGORIA (NOMBRE, DESCRIPCION) VALUES
('Whisky', 'Bebida destilada'),
('Ron', 'Licor de caña'),
('Vodka', 'Bebida neutra'),
('Tequila', 'Licor mexicano'),
('Cerveza', 'Bebida fermentada');

INSERT INTO INVENTARIO (CANTIDAD_DISPONIBLE) VALUES
(100),
(200),
(150),
(300),
(250);

INSERT INTO PRODUCTO (MARCA, PRECIO, GRADO_ALCOHOL, ID_PROVEEDOR, ID_CATEGORIA, ID_INVENTARIO) VALUES
('Johnnie Walker', 120000, 40, 'P1', 1, 1),
('Bacardi', 80000, 37, 'P2', 2, 2),
('Absolut', 90000, 38, 'P3', 3, 3),
('Jose Cuervo', 110000, 35, 'P4', 4, 4),
('Aguila', 5000, 5, 'P5', 5, 5);

INSERT INTO VENTA (MONTO, FECHA, ID_CLIENTE, ID_EMPLEADO) VALUES
(200000, '2026-05-01', 'C1', 'E1'),
(150000, '2026-05-02', 'C2', 'E2'),
(300000, '2026-05-03', 'C3', 'E3'),
(120000, '2026-05-04', 'C4', 'E4'),
(180000, '2026-05-05', 'C5', 'E5');

INSERT INTO DETALLE_VENTA (CANTIDAD_PRODUCTOS, SUBTOTAL, IVA, ID_VENTA, ID_PRODUCTO) VALUES
(2, 240000, 45600, 1, 1),
(1, 80000, 15200, 2, 2),
(3, 270000, 51300, 3, 3),
(2, 220000, 41800, 4, 4),
(5, 25000, 4750, 5, 5);