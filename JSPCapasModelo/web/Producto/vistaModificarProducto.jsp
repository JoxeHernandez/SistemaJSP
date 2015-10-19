<%-- 
    Document   : vistaModificarProducto
    Created on : 19/10/2015, 11:02:04 AM
    Author     : JOXE Y LEITER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="app.entidad.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modificar producto</h1>
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
                out.println("No se pudo Modificar producto debido "
                        + "al siguiente error:" + error);
            } else {
                
                out.println("El producto ha sido modificar...!!!");
            }
        %>
        

    </body>
</html>
