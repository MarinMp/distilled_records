# 🥃 Distilled Records – Sistema de Información y Venta

**Distilled Records** es una aplicación diseñada para la **gestión integral de una licorera**, permitiendo registrar y controlar productos, inventarios, proveedores, clientes y ventas de manera centralizada y eficiente.  
El sistema implementa lógica de negocio directamente en la base de datos mediante procedimientos almacenados, triggers y funciones, integra MongoDB para datos complementarios no relacionales, y expone una API REST construida en Spring Boot.

---

## 🧩 1. Descripción General

El proyecto busca resolver las deficiencias operativas de **Distilled Records**, empresa dedicada a la comercialización de bebidas alcohólicas que actualmente gestiona su información de forma manual y desintegrada, generando inconsistencias, duplicidad de datos y limitaciones para la toma de decisiones.

Cuenta con:

- **Backend (API REST)**: desarrollado en **Spring Boot**.
- **Frontend (Aplicación Web)**: por definir.
- **Base de Datos relacional**: implementada en **MySQL** sobre **Red Hat Enterprise Linux 8.8**.
- **Base de Datos NoSQL**: implementada en **MongoDB** para datos no relacionales.
- **Virtualización**: solución desplegada en máquina virtual con **Red Hat Enterprise Linux 8.8**.

---

## ⚙️ 2. Arquitectura General

```
┌──────────────────────────────┐
│          FRONTEND            │
│        (Por definir)         │
└──────────────┬───────────────┘
               │ REST API
               ▼
┌──────────────────────────────┐
│           BACKEND            │
│      Spring Boot (Java)      │
└──────┬───────────────┬───────┘
       │ JDBC          │ MongoDB Driver
       ▼               ▼
┌─────────────┐  ┌─────────────┐
│    MySQL    │  │   MongoDB   │
│  RHEL 8.8   │  │  RHEL 8.8   │
└─────────────┘  └─────────────┘
```

---

## 🧠 3. Tecnologías Principales

| Capa | Tecnología | Descripción |
|------|------------|-------------|
| **Frontend** | Por definir | Interfaz de demostración de operaciones principales |
| **Backend** | Java, Spring Boot | API REST, lógica de aplicación y conexión con BD |
| **Base de Datos Relacional** | MySQL | Persistencia principal, lógica de negocio en BD |
| **Base de Datos NoSQL** | MongoDB | Datos no estructurados y registros históricos |
| **Virtualización** | Red Hat Enterprise Linux 8.8 | Entorno de despliegue virtualizado |
| **Control de Versiones** | Git / GitHub | Gestión del código fuente y trabajo colaborativo |

---

## 🗂️ 4. Estructura del Repositorio

```
distilled_records/
├── backend/               # API REST Spring Boot
├── frontend/              # Aplicación web
├── database/
│   ├── mysql/             # Scripts SQL (creación, inserción, procedures, triggers)
│   └── mongodb/           # Modelos documentales y scripts MongoDB
└── README.md
```

---

## 🗄️ 5. Base de Datos MySQL

### Conexión
Configurada en el archivo `application.properties` del backend:
```
spring.datasource.url=jdbc:mysql://<IP_VM>:3306/distilled_records?useSSL=false&serverTimezone=UTC
spring.datasource.username=distilled_user
spring.datasource.password=distilled_pass
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=validate
```

### Entidades del Modelo (Peter Chen)

| Entidad | Atributos Principales |
|---|---|
| `usuario` | IdUsuario, Nombre, NumTelefono |
| `cliente` | IdUsuario (FK), Correo |
| `empleado` | IdUsuario (FK), UserName |
| `proveedor` | IdProveedor, Correo, Direccion |
| `ciudad` | IdCiudad, Nombre |
| `venta` | IdVenta, Fecha, Monto |
| `detalle_venta` | IdDetalle, CantidadProductos, Subtotal, IVA |
| `producto` | IdProducto, Marca, GradoAlcohol, Precio |
| `categoria` | IdCategoria, Nombre, Descripcion |
| `inventario` | IdInventario, CantidadDisponible |

Con relaciones 1:1, 1:N y N:M.

### Lógica de Negocio en BD
- ✅ Procedimientos almacenados
- ✅ Funciones
- ✅ Triggers
- ✅ Control de transacciones (COMMIT / ROLLBACK)
- ✅ Manejo de excepciones

---

## 🍃 6. Base de Datos MongoDB

### Nombre de la base de datos
`licorera_logs`

### Justificación Técnica

MongoDB se implementa como base de datos NoSQL **complementaria** al sistema relacional. Mientras MySQL gestiona la información transaccional crítica (facturas, productos, clientes, inventario, proveedores), MongoDB se utiliza para **logs, historial, auditoría y eventos del sistema**, evitando sobrecargar la BD relacional con datos que crecen rápidamente.

### Colecciones

| Colección | Descripción |
|---|---|
| `logs_usuarios` | Registro de acciones realizadas por usuarios |
| `auditoria_facturas` | Historial de operaciones sobre facturas |
| `eventos_sistema` | Eventos internos del sistema |
| `historial_consultas` | Consultas realizadas en reportes |

### Flujo de integración con MySQL

```
Usuario genera factura
        ↓
MySQL registra la venta
        ↓
Trigger actualiza inventario
        ↓
Backend registra log en MongoDB
```
---

## 📋 7. Requerimientos Funcionales

| # | Requerimiento |
|---|---------------|
| RF01 | Registro, consulta, actualización y eliminación de productos |
| RF02 | Gestión de inventarios y movimientos de productos |
| RF03 | Administración de proveedores y ciudades asociadas |
| RF04 | Registro y gestión de clientes |
| RF05 | Registro de ventas con sus detalles (productos, cantidades, IVA) |
| RF06 | Gestión de empleados que registran ventas |
| RF07 | Consulta de reportes de ventas e inventarios |
| RF08 | Reglas de negocio implementadas en la BD relacional |
| RF09 | Integridad y consistencia mediante transacciones y excepciones |

---

## 🧑‍💻 8. Autores

**Equipo de desarrollo:**
- 👩‍💻 María Paula Marín Soler
- 👨‍💻 David Leonardo Ortiz Cruz
- 👨‍💻 Diego Camilo Rodríguez Lemus

---

## 🏫 Información Académica

- **Universidad**: Universidad El Bosque
- **Programa**: Ingeniería de Sistemas
- **Asignatura**: Bases de Datos 2
- **Docente**: Ing. Christian Felipe Duarte
- **Proyecto**: Proyecto Final - Bases de Datos 2

---