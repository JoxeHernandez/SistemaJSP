<%-- 
    Document   : vistaEliminarProducto
    Created on : 18/10/2015, 06:19:55 PM
    Author     : capri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="app.entidad.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eliminar producto</h1>
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
                out.println("No se pudo eliminar producto debido "
                        + "al siguiente error:" + error);
            } else {
                
                out.println("El producto ha sido eliminado...!!!");
            }
        %>
        

    </body>
</html>