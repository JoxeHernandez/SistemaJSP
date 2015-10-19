<%-- 
    Document   : formModificarProducto
    Created on : 19/10/2015, 11:02:33 AM
    Author     : JOXE Y LEITER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modificar producto</h1>
        <table>
            <form action="ControladorProducto">
                <tr>
                    <td>Buscar por ID</td>
                    <td><input type="text" name="txtID"/></td>
                    <td><input type="submit" name="operacion" value="Buscar"/></td>
                </tr>
                <tr>
                    <td>Descripción</td>
                    <td><input type="text" name="txtDescripcion"/></td>
                </tr>
                <tr>
                    <td>Precio</td>
                    <td><input type="text" name="txtPrecio"/></td>
                </tr>
                <tr>
                    <td>Stock</td>
                    <td><input type="text" name="txtStock"/></td>
                </tr>
                <tr>
                    <td><input type="submit" name="operacion" value="Modificar"/></td>
                    <td><input type="submit" name="operacion" value="Cancelar"/></td>
                </tr>
            </form>
        </table>

    </body>
</html>
