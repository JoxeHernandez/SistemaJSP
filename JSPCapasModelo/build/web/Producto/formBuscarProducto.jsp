<%-- 
    Document   : formBuscarProducto.jsp
    Created on : 18/10/2015, 01:31:31 PM
    Author     : capri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Buscar producto</h1>
        <table>
            <form action="ControladorProducto">
                <tr>
                    <td>ID de producto</td>
                    <td><input type="text" name="txtID"/></td>
                </tr>
                <tr>
                    <td><input type="submit" name="operacion" value="Buscar"/></td>
                    <td><input type="submit" name="operacion" value="Cancelar"/></td>
                </tr>
            </form>
        </table>

    </body>
</html>