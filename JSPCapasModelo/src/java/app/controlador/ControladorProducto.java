package app.controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import app.dao.ProductoDao;
import app.entidad.Producto;
import app.servicio.ProductoServicio;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author i5
 */
@WebServlet(urlPatterns = {"/ControladorProducto"})
public class ControladorProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String operacion = request.getParameter("operacion");
        ProductoServicio servicio = new ProductoServicio();

        if (operacion.equals("Listar")) {
            try {
                ArrayList<Producto> productos = servicio.listarProductos();
                request.setAttribute("productos", productos);

            } catch (Exception e) {
                request.setAttribute("error", e.getMessage());
            }
            
            RequestDispatcher rd = request.getRequestDispatcher("vistaListarProductos.jsp");
            rd.forward(request, response);
        }

        if (operacion.equals("FormRegistrar")) {
            response.sendRedirect("formRegistrarProducto.jsp");
        }
        
        if(operacion.equals("Buscar")){
            try {
                int id=Integer.parseInt(request.getParameter("txtID"));
                ArrayList<Producto> productos = servicio.buscar(id);
                request.setAttribute("productos", productos);
                

            } catch (Exception e) {
                request.setAttribute("error", e.getMessage());

            }
            RequestDispatcher rd = request.getRequestDispatcher("vistaBuscarProducto.jsp");
            rd.forward(request, response);
        }
        
        if(operacion.equals("FormBuscar")){
            response.sendRedirect("formBuscarProducto.jsp");
        }
        
        if(operacion.equals("FormEliminar")){
            response.sendRedirect("formEliminarProducto.jsp");
        }
        
        if(operacion.equals("FormModificar")){
            response.sendRedirect("formModificarProducto.jsp");
        }

        if (operacion.equals("Registrar")) {
            try {
                String descripcion=request.getParameter("txtDescripcion");
                Double precio=Double.parseDouble(request.getParameter("txtPrecio"));
                Double stock=Double.parseDouble(request.getParameter("txtStock"));                
                Producto producto = new Producto(descripcion, precio, stock);
                request.setAttribute("producto", producto);
                servicio.registrarProducto(producto);                
            } catch (Exception e) {
                request.setAttribute("error", e.getMessage());
            }
            RequestDispatcher rd = request.getRequestDispatcher("vistaRegistrarProducto.jsp");
            rd.forward(request, response);
        }
        
        if(operacion.equals("Modificar")){
            try {
                int id=Integer.parseInt(request.getParameter("txtID"));
                String descripcion=request.getParameter("txtDescripcion");
                Double precio=Double.parseDouble(request.getParameter("txtPrecio"));
                Double stock=Double.parseDouble(request.getParameter("txtStock"));                
                Producto producto = new Producto(descripcion, precio, stock);
                request.setAttribute("producto", producto);
                servicio.modificar(producto, id);
            } catch (Exception e) {
                request.setAttribute("error", e.getMessage());
            }
            RequestDispatcher rd = request.getRequestDispatcher("vistaModificarProducto.jsp");
            rd.forward(request, response);
        }
        
        if(operacion.equals("Eliminar")){
            try {
                int id=Integer.parseInt(request.getParameter("txtID"));
                servicio.eliminar(id);
            } catch (Exception e) {
                request.setAttribute("error", e.getMessage());
            }
            RequestDispatcher rd = request.getRequestDispatcher("vistaEliminarProducto.jsp");
            rd.forward(request, response);
        }
        
        if (operacion.equals("Cancelar")) {
            response.sendRedirect("menu.jsp");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
