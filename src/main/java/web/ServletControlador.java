package web;

import DTO.UsuarioDTO;
import datos.PersonaDAOJDBC;
import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarCliente(request, response);
                    break;
                default:
                    this.accionDefault(request, response);

            }
        } else {
            this.accionDefault(request, response);
        }

    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<UsuarioDTO> usuario = new PersonaDAOJDBC().listar();
        System.out.println("usuario =" + usuario);
        request.setAttribute("usuario", usuario);
        request.setAttribute("totalClientes", usuario.size());

        //este me permte ver el saldo total de los clientes 
        request.setAttribute("saldoTotal", this.calcularSaldoTotal(usuario));
        request.getRequestDispatcher("usuarios.jsp").forward(request, response);

    }

    // hace parte del metodo que me permite ver el saldo total  del cliente 
    private double calcularSaldoTotal(List<UsuarioDTO> usuarios) {
        double saldoTotal = 0;
        for (UsuarioDTO usuario : usuarios) {
            saldoTotal += usuario.getValor_credito();
        }
        return saldoTotal;

    }

    private void editarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//         recuperamos el Id_usuario del listado usuarios
//        int id_usuario = 0;
//        String saldoStrin = request.getParameter("id_usuario");
//        if (saldoStrin != null && !"".equals(saldoStrin)) {
//            id_usuario = Integer.parseInt(saldoStrin);

//        }
       int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));

        UsuarioDTO usuario = new PersonaDAOJDBC().encontrar(new UsuarioDTO(id_usuario));

        request.setAttribute("usuario", usuario);

        String jspEdit = "/WEB-INF/paginas/usuario/editarUsuario.jsp";
        request.getRequestDispatcher(jspEdit).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarCliente(request, response);
                    break;
                case "modificar":
                    this.modificarCliente(request, response);
                    break;
                default:
                    this.accionDefault(request, response);

            }
        } else {
            this.accionDefault(request, response);
        }

    }

    private void insertarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");

        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        int id_rol = 0;
        String saldoString = request.getParameter("id_rol");
        if (saldoString != null && !"".equals(saldoString)) {
            id_rol = Integer.parseInt(saldoString);

        }
        String contrasena = request.getParameter("contrasena");

        /**
         * double valor_credito=0; String
         * saldoString=request.getParameter("valor_credito"); if(saldoString
         * !=null && ! "".equals(saldoString)){
         * valor_credito=Double.parseDouble(saldoString);
         *
         * }*
         */
        UsuarioDTO usuario = new UsuarioDTO(cedula, nombre, apellido, correo, telefono, id_rol, contrasena);
        System.out.println("los datos nuevos son " + usuario);
        int usuario1 = new PersonaDAOJDBC().insertar(usuario);
        System.out.println("los datos nuevos son " + usuario);
        this.accionDefault(request, response);

    }

    private void modificarCliente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //recuperamos los valores de formulario de editar usuario
        int id_usuario = 0;
        String saldoStrin = request.getParameter("id_usuario");
        if (saldoStrin != null && !"".equals(saldoStrin)) {
            id_usuario = Integer.parseInt(saldoStrin);

        }
        //int id_usuario = Integer.parseInt(getInitParameter("id_usuario"));
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");

        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        int id_rol = 0;
        String saldoString = request.getParameter("id_rol");
        if (saldoString != null && !"".equals(saldoString)) {
            id_rol = Integer.parseInt(saldoString);

        }
        String contrasena = request.getParameter("contrasena");

        /**
         * double valor_credito=0; String
         * saldoString=request.getParameter("valor_credito"); if(saldoString
         * !=null && ! "".equals(saldoString)){
         * valor_credito=Double.parseDouble(saldoString);
         *
         * }*
         */
        UsuarioDTO usuario = new UsuarioDTO(id_usuario, cedula, nombre, apellido, correo, direccion, telefono, id_rol, contrasena, id_usuario);
        System.out.println("los datos nuevos son " + usuario);
        int usuario1 = new PersonaDAOJDBC().actualizar(usuario);
        System.out.println("los datos nuevos son " + usuario);
        this.accionDefault(request, response);

    }

}
