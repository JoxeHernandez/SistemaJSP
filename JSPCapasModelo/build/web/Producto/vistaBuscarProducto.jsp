<%-- 
    Document   : vistaBuscarProducto
    Created on : 18/10/2015, 01:55:50 PM
    Author     : capri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,app.entidad.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Busqueda de productos</h1>
        <table>
            <%
                ArrayList<Producto> productos = (ArrayList) request.getAttribute("productos");
                if (productos != null) {
                    for (Producto p : productos) {
                        out.println("<tr> <td>" + p.getId() + "</td>"
                                + "<td>" + p.getDescripcion() + "</td>"
                                + "<td>" + p.getPrecio() + "</td>"
                                + "<td> " + p.getStock() + " </td> </tr>");
                    }
                } else {
                    out.println("No se encuentra el producto");
                }
            %>
        </table>
        

    </body>
</html>
