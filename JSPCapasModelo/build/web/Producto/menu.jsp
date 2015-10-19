<%-- 
    Document   : menu
    Created on : 21/10/2014, 07:11:54 PM
    Author     : i5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Operaciones de producto</h1>
        <ul>
            <li><a href="./ControladorProducto?operacion=FormRegistrar">Nuevo producto</a></li>
            <li><a href="./ControladorProducto?operacion=FormEliminar">Eliminar producto</a></li>
            <li><a href="./ControladorProducto?operacion=FormModificar">Modificar producto</a></li>
            <li><a href="./ControladorProducto?operacion=FormBuscar">Buscar producto</a></li>
            <li><a href="./ControladorProducto?operacion=Listar">Listar productos</a></li>
        </ul>
    </body>
</html>
